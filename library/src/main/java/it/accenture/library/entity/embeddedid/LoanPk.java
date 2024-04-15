package it.accenture.library.entity.embeddedid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanPk implements Serializable {
    @Column(name = "UTENTEID")
    private Long userId;

    @Column(name = "LIBROID")
    private Long bookId;
}
