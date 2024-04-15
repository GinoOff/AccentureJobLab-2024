package it.accenture.library.repository;

import it.accenture.library.entity.Loan;
import it.accenture.library.entity.embeddedid.LoanPk;
import it.accenture.library.rto.LoanRTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface LoanRespository extends JpaRepository<Loan, LoanPk> {
    @Query("SELECT new it.accenture.library.rto.LoanRTO(U.nome, U.cognome, B.title, B.author, B.isbn, L.startDate, L.endDate) " +
            "FROM Loan L JOIN User U on L.id.userId = U.id JOIN Book B On L.id.bookId = B.id"
    )
    public List<LoanRTO> findAllLoans();
}
