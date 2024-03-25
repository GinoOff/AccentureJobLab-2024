package it.accenture.library.to;

import it.accenture.library.entity.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTO {
    private String title;
    private String author;
    private String isbn;
    public BookTO(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.isbn = book.getIsbn();
    }
}
