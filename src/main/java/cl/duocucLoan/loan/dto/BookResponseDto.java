package cl.duocucLoan.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDto {

    private Long Bookisbn;

    private String Booktitle;

    private String Bookauthor;

}


