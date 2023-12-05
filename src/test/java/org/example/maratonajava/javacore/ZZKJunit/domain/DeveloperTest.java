package org.example.maratonajava.javacore.ZZKJunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    void getMainLanguage() {
    }

    @Test
    public void instanceOf_ReturnExecutesChildClassMethodWhenObjectIsOfChild() {
        Employee employeeDeveloper = new Developer("1", "Java");
//        if (employeeDeveloper instanceof Developer) {
//            Developer d = (Developer) employeeDeveloper;
//            Assertions.assertEquals("Java", d.getMainLanguage());
//        }

        if (employeeDeveloper instanceof Developer developer) {
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }


}