package org.example.maratonajava.javacore.Fmodificadorestatico.test;

import org.example.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro carro1 = new Carro("bmw",300);
        Carro carro2 = new Carro("Mercedes",500);
        Carro carro3 = new Carro("Audi",900);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

    }
}
