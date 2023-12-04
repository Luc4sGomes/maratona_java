package org.example.maratonajava.javacore.ZZKJunit.service;

import org.example.maratonajava.javacore.ZZKJunit.domain.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person Can't be null");
        return person.getAge() >= 18;
    }
}
