package org.example.maratonajava.javacore.ZZKJunit.service;

import org.example.maratonajava.javacore.ZZKJunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    @DisplayName("A Person should be not adult when age is Lower than Eighteen")
    void isAdultTest() {
        Person person = new Person(12);
        PersonService personService = new PersonService();
        assertFalse(personService.isAdult(person));
        Assertions.assertEquals(false, personService.isAdult(person));
    }
}