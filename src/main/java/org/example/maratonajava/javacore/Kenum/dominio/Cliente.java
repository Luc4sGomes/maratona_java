package org.example.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String name;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public enum TipoPagamento {
        DEBITO, CREDITO
    }

    public Cliente(String name, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoClienteInt=" + tipoCliente.getRELATORIO() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
