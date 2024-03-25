package it.accenture.library.service;


import it.accenture.library.entity.Book;
import it.accenture.library.repository.BookRepository;
import it.accenture.library.rto.BookRTO;
import it.accenture.library.to.BookTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<BookRTO> findAllBooks(){
        List<Book> books = bookRepository.findAllBooks();
        List<BookRTO> booksRTO = new ArrayList<>();

        for (Book book : books){
            BookRTO bookRTO = new BookRTO();
            BookRTO.setTitle(book.getTitolo());
            BookRTO.setAuthor(book.getAutore());
            BookRTO.setIsbn(book.getIsbn());

            booksRTO.add(bookRTO);
        }
        return booksRTO;
    }

    public BookRTO findAllBookById(long id){
        bookRepository.findBookById(id);
        return new BookRTO(book);
    }


    public Object saveBook(BookTO book){
        Book bookToSave = new Book(book);
        Long id = bookRepository.save(bookToSave).getId();
        return id;
    }
}
