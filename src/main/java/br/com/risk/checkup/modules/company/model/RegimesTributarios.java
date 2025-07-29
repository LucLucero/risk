package br.com.risk.checkup.modules.company.model;

public enum RegimesTributarios {

    MEI("MEI"),
    Simples_Nacional("Simples Nacional"),
    Lucro_Presumido("Lucro Presumido"),
    Lucro_Real("Lucro Real");

    private final String valor;

    RegimesTributarios(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

