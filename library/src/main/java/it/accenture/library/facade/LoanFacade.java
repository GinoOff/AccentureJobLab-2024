package it.accenture.library.facade;

import it.accenture.library.rto.LoanRTO;
import it.accenture.library.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoanFacade {
    @Autowired
    private LoanService loanService;

    public List<LoanRTO> findAllLoans(){
        return loanService.findAll();
    }
}
