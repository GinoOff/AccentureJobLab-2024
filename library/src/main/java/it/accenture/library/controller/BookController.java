package it.accenture.library.controller;

import it.accenture.library.facade.BookFacade;
import it.accenture.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

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
    public ResponseEntity<Object> findBookById(@PathVariable long id){
        return new ResponseEntity<>(BookFacade.findAll(id), HttpStatus.OK)
    }
}
