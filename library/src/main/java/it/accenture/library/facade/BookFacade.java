package it.accenture.library.facade;

import it.accenture.library.entity.Book;
import it.accenture.library.repository.BookRepository;
import it.accenture.library.rto.BookRTO;
import it.accenture.library.service.BookService;
import it.accenture.library.to.BookTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //tutti i component in funzione puteranno alla stessa porzione di memoria
public class BookFacade {
    @Autowired
    private BookService bookService;

    public List<BookRTO> findAllBooks(){
        return bookService.findAllBooks();

    }

    public BookRTO findAllBookById(long id){
        return bookService.findAllBookById(id);
    }

    public Long addBook(BookTO bookTo){
        return bookService.addBook(bookTo);
    }
}
