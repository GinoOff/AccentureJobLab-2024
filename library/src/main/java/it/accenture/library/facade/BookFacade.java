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

@Component
public class BookFacade {
    @Autowired
    private BookService bookService;

    public List<BookRTO> findAll(){
        return bookService.findAllBooks();

    }

    public BookRTO findAllBookById(long id){
        Book book = bookService.findAllBookById(id);
        return new BookRTO(book);
    }

    public Object saveBook(BookTO book){
        Book bookToSave = new Book(book);
        Long id = bookRepository.save(bookToSave).getId();
        return id;
    }
}
