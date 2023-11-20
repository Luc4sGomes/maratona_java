package org.example.maratonajava.javacore.ZGenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {

        List<Cachorro> cachorroList = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoList = List.of(new Gato(), new Gato());
        List<Animal> animals = new ArrayList<>();

        printConsultaAnimal(animals);
        printConsulta(gatoList);
        printConsulta(cachorroList);


    }


    //wildCard = ?
    private static void printConsulta(List<? extends Animal> animals) {
        Animal a = new Cachorro();
        Animal b = new Gato();
        for (Animal animal : animals

        ) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        Animal animal2 = new Gato();
        animals.add(new Cachorro()); //garantia do polimorfismo
        animals.add(new Gato());
    }

}
