package org.example.maratonajava.javacore.NPolimorfismo.service;

import org.example.maratonajava.javacore.NPolimorfismo.domain.Computador;
import org.example.maratonajava.javacore.NPolimorfismo.domain.Produto;
import org.example.maratonajava.javacore.NPolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Produto: " + produto.getValor());
        System.out.println("Produto: " + imposto);
    }
}
