package cl.duocucLoan.loan.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data @NoArgsConstructor @AllArgsConstructor
public class UserResponseDto {

    private String Userut;

    private String userName;

    private String UserEmail;

    private LocalDate UserMembershipedDate;

}

