package org.example.maratonajava.javacore.NPolimorfismo.domain;

public class Computador extends Produto {

    public static final double IMPOSTO_POR_CENTO = 0.20;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
