package cl.duocucLoan.loan.service;

import cl.duocucLoan.loan.client.BookClient;
import cl.duocucLoan.loan.client.UserClient;
import cl.duocucLoan.loan.dto.LoanResponseDto;
import cl.duocucLoan.loan.model.Loan;
import cl.duocucLoan.loan.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements ILoanService {

    private final LoanRepository loanRepository;
    private final UserClient userClient;
    private final BookClient bookClient;

    private LoanResponseDto toDto(Loan loan) {
        return new LoanResponseDto(
                loan.getIdLoan(),
                bookClient.getBookByIsbn(loan.getBookIsbn()),
                userClient.getUserByRut(loan.getUserRut()),
                loan.getLoanDate(),
                loan.getDueDate(),
                loan.getReturnedDate()
        );

    }

}
