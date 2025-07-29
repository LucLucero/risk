package br.com.risk.checkup.modules.company.repository;


import br.com.risk.checkup.modules.company.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {

    Optional<CompanyEntity> findByNameAndCnpj();

}
