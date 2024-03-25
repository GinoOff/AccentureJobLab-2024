package it.accenture.library.service;


import it.accenture.library.entity.Book;
import it.accenture.library.repository.BookRepository;
import it.accenture.library.rto.BookRTO;
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
            BookRTO.setTitle(book.getTitle());
            BookRTO.setAuthor(book.getAuthor());
            BookRTO.setIsbn(book.getIsbn());

            booksRTO.add(bookRTO);
        }
        return booksRTO;
    }

    public BookRTO findAllBookById(){
        return null;
    }
}
