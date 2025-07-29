package br.com.risk.checkup.modules.company.controller;


import br.com.risk.checkup.modules.company.CompanyEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {



    @PostMapping("/")
    public ResponseEntity<Object> registerCompany(@Valid @RequestBody CompanyEntity companyEntity){



    }

}
