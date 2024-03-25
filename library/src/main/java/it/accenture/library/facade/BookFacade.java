package it.accenture.library.facade;

import it.accenture.library.rto.BookRTO;
import it.accenture.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookFacade {
    @Autowired
    private BookService bookService;

    public List<BookRTO> findAll(){
        return bookService.findAllBooks();

    }

    public BookRTO findAllBookById(long id){
        return bookService.findAllBookById(id);
    }
}
