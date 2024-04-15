package it.accenture.library.entity;

import it.accenture.library.to.BookTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "LIBRO")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTORE")
    private String author;

    @Column(name = "ISBN")
    private String isbn;

    public Book(BookTO book){
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.isbn = book.getIsbn();
    }

    public Book(){}



}
