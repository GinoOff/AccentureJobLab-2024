package it.accenture.library.entity;

import it.accenture.library.to.UserTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "UTENTE")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "COGNOME")
    private String cognome;

    public User(UserTO user) {
        this.nome = user.getNome();
        this.cognome = user.getCongome();
    }

    public User(){}
}
