package it.accenture.library.to;

import it.accenture.library.entity.Book;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter

public class BookTO {
    @NotNull
    private String title;
    private String author;
    private String isbn;
    public BookTO(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.isbn = book.getIsbn();
    }

    public BookTO(){}


}
