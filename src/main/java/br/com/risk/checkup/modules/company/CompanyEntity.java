package br.com.risk.checkup.modules.company;

import br.com.risk.checkup.modules.company.model.Desafios;
import br.com.risk.checkup.modules.company.model.Estados;
import br.com.risk.checkup.modules.company.model.RegimesTributarios;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Set;
import java.util.UUID;


@Entity(name = "tbl_company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    private String cnpj;

    @Email(message = "[Email] Deve-se cadastrar um email válido!")
    private List<String> email;

    private List<String> phone;

    private List<String> city;

    @Enumerated(EnumType.STRING)
    private Estados estados;

    @Enumerated(EnumType.STRING)
    private RegimesTributarios regimeTributario;

    private Integer numColaboradores;

    @Enumerated(EnumType.STRING)
    private Set<Desafios> desafios;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    public RegimesTributarios getRegimeTributario() {
        return regimeTributario;
    }

    public void setRegimeTributario(RegimesTributarios regimeTributario) {
        this.regimeTributario = regimeTributario;
    }

    public Integer getNumColaboradores() {
        return numColaboradores;
    }

    public void setNumColaboradores(Integer numColaboradores) {
        this.numColaboradores = numColaboradores;
    }

    public Set<Desafios> getDesafios() {
        return desafios;
    }

    public void setDesafios(Set<Desafios> desafios) {
        this.desafios = desafios;
    }
}
