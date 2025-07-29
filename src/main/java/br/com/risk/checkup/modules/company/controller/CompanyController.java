package br.com.risk.checkup.modules.company.controller;


import br.com.risk.checkup.modules.company.CompanyEntity;
import br.com.risk.checkup.modules.company.services.RegisterCompanyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private RegisterCompanyService registerCompanyService;


    @PostMapping("/")
    public ResponseEntity<Object> registerCompany(@Valid @RequestBody CompanyEntity companyEntity){
        try {

            var result = registerCompanyService.execute(companyEntity);
            return ResponseEntity.status(HttpStatus.OK).body(result);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }


    }

}
