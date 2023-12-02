package org.example.maratonajava.javacore.PadroesDeProjeto.test;

import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Person;

public class BuilderPatternTest {
    public static void main(String[] args) {


        Person person = new Person.PersonBuilder()
                .firstName("Lucas")
                .lastName("Nascimento")
                .userName("gominha")
                .email("lucasgominhaa448@gmail.com")
                .build();


        Person person2 = new Person.PersonBuilder()
                .firstName("Neide")
                .lastName("Barbosa")
                .build();

        System.out.println(person);
        System.out.println(person2);
    }
}
