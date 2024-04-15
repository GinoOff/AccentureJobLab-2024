package it.accenture.library.rto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanRTO {
    private String name;
    private String surname;
    private String title;
    private String author;
    private String isbn;
    private Long startDate;
    private Long endDate;
}
