package org.example.maratonajava.javacore.NPolimorfismo.service;

import org.example.maratonajava.javacore.NPolimorfismo.domain.Computador;
import org.example.maratonajava.javacore.NPolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();

        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do computador");
        double imposto = tomate.calcularImposto();

        System.out.println("Computador: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

    }
}
