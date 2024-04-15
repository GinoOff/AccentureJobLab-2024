package it.accenture.library.service;

import it.accenture.library.entity.Loan;
import it.accenture.library.repository.LoanRespository;
import it.accenture.library.rto.LoanRTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanRespository loanRespository;
    public List<LoanRTO> findAll(){
        return loanRespository.findAllLoans();
    }
}
