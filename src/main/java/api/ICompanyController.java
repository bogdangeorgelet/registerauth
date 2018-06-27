package api;

import dto.CompanyDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/company")
public interface ICompanyController {

    @GetMapping
    ResponseEntity<List<CompanyDto>> allCompanies();

    @GetMapping
    ResponseEntity<?> getClient(@PathVariable Long id);

}
