package org.example.maratonajava.javacore.Bintroductionmetodos.test;

import org.example.maratonajava.javacore.Bintroductionmetodos.dominio.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("naruto");
        person.setAge(14);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
