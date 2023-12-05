package org.example.maratonajava.javacore.ZZKJunit.service;

import org.example.maratonajava.javacore.ZZKJunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;


    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(10);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A Person should be not adult when age is Lower than Eighteen")
    void isAdultTest_ReturnFalse_WhenAgeIsLowerThan18() {
        assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A Person should be adult when age is Greater than Eighteen")
    void isAdultTest_ReturnTrue_WhenAgeIsBiggerThan18() {
        assertTrue(personService.isAdult(adult));
    }


    @Test
    @DisplayName("Should thorw NPE with message when person is null")
    void isAdult_ShouldReturnException_whenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(null));
    }


    @Test
    @DisplayName("Should return List With only Adults")
    void isAdult_ReturnListWithOnlyAdult_WhenListOfPersonWithAdultIsPassed() {
        Person person = new Person(16);
        Person person1 = new Person(22);
        Person person2 = new Person(59);
        Person person3 = new Person(100);
        Person person4 = new Person(10);
        List<Person> personList = List.of(person, person1, person2, person3, person4);
        Assertions.assertEquals(3, personService.filterRemovingNotAdult(personList).size());
    }


}