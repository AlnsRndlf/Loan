package cl.duocucLoan.loan.client;


import cl.duocucLoan.loan.dto.BookResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "boook-service", url = "localhost:8081/api/v1/books")
public interface BookClient {

    @GetMapping("/{isbn}")
    BookResponseDto getBookByIsbn(@PathVariable("isbn") Long isbn);

    @PatchMapping("/{isbn}/stock/{quantity}")
    BookResponseDto updateStock(@PathVariable("isbn") Long isbn, @PathVariable("quantity") int quantity);
}
