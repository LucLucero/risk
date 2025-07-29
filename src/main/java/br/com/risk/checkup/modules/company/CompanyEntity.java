package br.com.risk.checkup.modules.company;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;


@Entity(name = "tbl_company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private List<String> cnpj;

    private List<String> email;

    private List<String> ;

    private List<String> city;
}
