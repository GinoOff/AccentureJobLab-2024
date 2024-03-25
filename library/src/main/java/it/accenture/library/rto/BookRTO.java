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

    public BookRTO(Book book) {
        this.title = book.getTitolo();
        this.author = book.getAutore();
        this.isbn = book.getIsbn();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
