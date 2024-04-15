package it.accenture.library.entity;

import it.accenture.library.entity.embeddedid.LoanPk;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "PRESTITO")
public class Loan {
    @EmbeddedId //Dice a java che deve considerare LoanPk come primary Key
    private LoanPk id;

    @Column(name = "STARTDATE")
    private Long startDate;

    @Column(name = "ENDDATE")
    private Long endDate;

    public Loan(){}
}
