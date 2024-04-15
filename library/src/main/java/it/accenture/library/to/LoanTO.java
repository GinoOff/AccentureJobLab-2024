package it.accenture.library.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanTO {
    private Long userId;
    private Long bookId;

    private Long startDate;
    private Long endDate;
}
