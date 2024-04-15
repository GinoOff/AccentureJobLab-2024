package it.accenture.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import it.accenture.library.facade.BookFacade;
import it.accenture.library.repository.BookRepository;
import it.accenture.library.service.BookService;
import it.accenture.library.to.BookTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.validation.Valid;

@RestController //si occupa di captare richieste REST
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookFacade bookFacade;

    @GetMapping("/all")
    public ResponseEntity<Object> findAll(){
        return new ResponseEntity<>(bookFacade.findAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findBookById(@PathVariable Long id){
        if(id == null){
            return new ResponseEntity<>("l'id non può essere Null", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(bookFacade.findAllBookById(id), HttpStatus.OK);
    }
    @PostMapping("/")
    @Operation(description = "Aggiungi un libro a database", responses = {
            @ApiResponse(responseCode = "200", description = "Libro aggiunto correttamente")
    })

    @GetMapping("/save")
    public ResponseEntity<Object> saveBooks(@Valid @RequestBody BookTO book){
        return  new ResponseEntity<>(bookFacade.addBook(book), HttpStatus.OK);
    }
}
