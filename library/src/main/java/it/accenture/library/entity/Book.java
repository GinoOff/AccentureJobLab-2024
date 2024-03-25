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

    @Column(name = "TITOLO")
    private String titolo;

    @Column(name = "AUTORE")
    private String autore;

    @Column(name = "ISBN")
    private String isbn;

    public Book(BookTO book){
        this.titolo = book.getTitle();
        this.autore = book.getAuthor();
        this.isbn = book.getIsbn();
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
