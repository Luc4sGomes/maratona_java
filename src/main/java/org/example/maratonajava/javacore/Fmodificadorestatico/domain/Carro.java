package org.example.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String name;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;

    public Carro(String name, double velocidadeMax) {
        this.name = name;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static  double getVelocidadeLimit(){
        return Carro.velocidadeLimite;
    }
}
