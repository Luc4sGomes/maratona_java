package org.example.maratonajava.javacore.Jmodifcadorfinal.test;

import org.example.maratonajava.javacore.Jmodifcadorfinal.domain.Carro;
import org.example.maratonajava.javacore.Jmodifcadorfinal.domain.Comprador;

public final class CarTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        Comprador comprador = new Comprador();

        String string1 = new String("lucas");
        String string2 = new String("lucas");

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
    }
}
