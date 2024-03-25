package it.accenture.library.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "LIBRO")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "TITOLO")
    private String titolo;

    @Column(name = "AUTORE")
    private String autore;

    @Column(name = "ISBN")
    private String isbn;

    public Book(BookTO){
        this.titolo = b
    }

}
