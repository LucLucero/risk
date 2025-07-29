package br.com.risk.checkup.modules.company.model;

public enum Desafios {

    GESTAO_FINANCEIRA("Gestão Financeira"),
    PROCESSOS_DESORGANIZADOS("Processos Desorganizados"),
    CARGA_TRIBUTARIA_ELEVADA("Carga Tributária Elevada"),
    DEPARTAMENTO_PESSOAL_RH("Departamento Pessoal / RH"),
    DIFICULDADES_EMISSAO_NOTAS_REGULARIZACAO("Dificuldades na Emissão de Notas e Regularização"),
    PROBLEMAS_CONTABIL("Problemas Contábil"),
    QUERO_CRESCER_MAS_NAO_SEI_COMO("Quero Crescer, mas Não Sei Como"),
    OUTRAS("Outras");

    private final String descricao;

    Desafio(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    }
