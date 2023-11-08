package org.example.maratonajava.javacore.NPolimorfismo.domain;

public class Celular extends Produto{
    public static final double IMPOSTO_POR_CENTO = 10.0;

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do celular");
        return this.valor * IMPOSTO_POR_CENTO;
    }


}
