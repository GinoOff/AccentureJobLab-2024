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
        List<Book> books = bookRepository.findAll();

        //ENTITY to RTO
        List<BookRTO> booksRTO = new ArrayList<>();

        for (Book book : books){
            BookRTO bookRTO = new BookRTO();
            bookRTO.setTitle(book.getTitle());
            bookRTO.setAuthor(book.getAuthor());
            bookRTO.setIsbn(book.getIsbn());
            booksRTO.add(bookRTO);
        }
        return booksRTO;
    }

    public BookRTO findAllBookById(long id){
        Book book = bookRepository.findBookById(id);
        return new BookRTO(book);
    }

    public Object saveBook(BookTO book){
        Book bookToSave = new Book(book);
        Long id = bookRepository.save(bookToSave).getId();
        return id;
    }

    public Long addBook(BookTO bookTo) {
        Book book = new Book(bookTo);
        bookRepository.save(book);
        return book.getId();
    }
}
