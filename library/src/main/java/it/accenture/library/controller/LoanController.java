package it.accenture.library.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.accenture.library.facade.LoanFacade;
import it.accenture.library.rto.LoanRTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //si ocupa di raccogliere le richieste REST
@RequestMapping("/loan")
@Tag(name = "Loan Controller", description = "Insieme di API che gestiscono i prestiti")
public class LoanController {
    @Autowired
    private LoanFacade loanFacade;

    @GetMapping("/all")
    @Operation(description = "Recupera tutti i prestiti", responses = @ApiResponse(responseCode = "200", description = "Prestiti recuperati correttamente"))
    public ResponseEntity<List<LoanRTO>> findAllLoan(){
        return new ResponseEntity<>(loanFacade.findAllLoans(), HttpStatus.OK);
    }
}
