package org.example.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PJ(1, "nome relatorio"),
    PF(2, "nome relatorio");
    private final int VALUE;
    private final String RELATORIO;

    TipoCliente(int value, String relatorio) {
        this.VALUE = value;
        this.RELATORIO = relatorio;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getRELATORIO() {
        return RELATORIO;
    }

}
