package it.accenture.library.rto;

import it.accenture.library.entity.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRTO {
    private String title;
    private String author;
    private String isbn;

    public BookRTO(Book book){

    }

    public BookRTO() {

    }
}
