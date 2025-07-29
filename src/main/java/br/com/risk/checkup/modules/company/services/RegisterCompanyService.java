package br.com.risk.checkup.modules.company.services;

import br.com.risk.checkup.exceptions.UserFoundException;
import br.com.risk.checkup.modules.company.CompanyEntity;
import br.com.risk.checkup.modules.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterCompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity){

        this.companyRepository.findByNameAndCnpj()
            .ifPresent((c) -> {

                throw new UserFoundException();

            });

        return companyRepository.save(companyEntity);
    }


}
