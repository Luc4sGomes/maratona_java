package org.example.maratonajava.javacore.ZGenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}

public class WildCardTest {
    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animals = {new Gato(), new Cachorro()};
        printConsulta(animals);

    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals

        ) {
            animal.consulta();
        }
    }
}
