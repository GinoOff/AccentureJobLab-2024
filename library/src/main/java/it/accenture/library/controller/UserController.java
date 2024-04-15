package it.accenture.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import it.accenture.library.facade.UserFacade;
import it.accenture.library.to.BookTO;
import it.accenture.library.to.UserTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserFacade userFacade;

    @GetMapping("/{id}")
    public ResponseEntity<Object> findUserById(@PathVariable Long id){
        if (id == null){
            return new ResponseEntity<>("L'id non può essere Null", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userFacade.findAllUserById(id), HttpStatus.OK);
    }
    @PostMapping("/")
    @Operation(description = "Aggiungi un libro a database", responses = {
            @ApiResponse(responseCode = "200", description = "Libro aggiunto correttamente")
    })

    @GetMapping("/save")
    public ResponseEntity<Object> saveUser(@Valid @RequestBody UserTO user){
        return new ResponseEntity<>(userFacade.addUser(user), HttpStatus.OK);
    }
}
