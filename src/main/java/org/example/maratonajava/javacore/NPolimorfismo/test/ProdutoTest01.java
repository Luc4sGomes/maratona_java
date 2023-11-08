package org.example.maratonajava.javacore.NPolimorfismo.test;

import org.example.maratonajava.javacore.NPolimorfismo.domain.Computador;
import org.example.maratonajava.javacore.NPolimorfismo.domain.Tomate;
import org.example.maratonajava.javacore.NPolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I2", 111000);
        Tomate tomate = new Tomate("Tomate pepino", 10);

        System.out.println("______________________");

        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
