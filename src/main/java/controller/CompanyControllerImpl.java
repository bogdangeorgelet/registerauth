package controller;

import api.ICompanyController;
import dto.CompanyDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Component
@CrossOrigin
public class CompanyControllerImpl implements ICompanyController {

    @Override
    public ResponseEntity<List<CompanyDto>> allCompanies() {
        return null;
    }

    @Override
    public ResponseEntity<?> getClient(Long id) {
        return null;
    }

}
