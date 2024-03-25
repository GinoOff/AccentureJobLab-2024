package it.accenture.library.controller;

import it.accenture.library.facade.BookFacade;
import it.accenture.library.repository.BookRepository;
import it.accenture.library.to.BookTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookFacade BookFacade;

    @GetMapping("/all")
    public ResponseEntity<Object> findAll(){
        return new ResponseEntity<>(BookFacade.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findBookById(@PathVariable Long id){
        if(id == null){
            return new ResponseEntity<>("l'id non può essere Null", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(BookFacade.findAllBookById(id), HttpStatus.OK);
    }

    @GetMapping("/save")
    public ResponseEntity<Object> saveBooks(@Valid @RequestBody BookTO book){
        return  new ResponseEntity<>(BookFacade.saveBook(book), HttpStatus.OK);
    }
}
