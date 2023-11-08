package org.example.maratonajava.javacore.NPolimorfismo.test;

import org.example.maratonajava.javacore.NPolimorfismo.domain.Celular;
import org.example.maratonajava.javacore.NPolimorfismo.domain.Computador;
import org.example.maratonajava.javacore.NPolimorfismo.domain.Tomate;
import org.example.maratonajava.javacore.NPolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I2", 111000);
        Tomate tomate = new Tomate("Tomate pepino", 10);
        Celular celular = new Celular("samsung", 1800);


        CalculadoraImposto.calcularImposto(computador);

        System.out.println("------------------------");

        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("------------------------");

        CalculadoraImposto.calcularImposto(celular);


    }
}
