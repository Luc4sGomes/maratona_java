package org.example.maratonajava.javacore.ZZKJunit.test;

import org.example.maratonajava.javacore.ZZKJunit.domain.Person;
import org.example.maratonajava.javacore.ZZKJunit.service.PersonService;

public class PersonServiceTest {
    public static void main(String[] args) {
        Person person = new Person(12);

        PersonService personService = new PersonService();
        personService.isAdult(person);

    }
}
