package org.example.maratonajava.javacore.ZGenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {

        List<Cachorro> cachorroList = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoList = List.of(new Gato(), new Gato());

    }

    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals

        ) {
            animals.add(new Cachorro());
        }
    }
}
