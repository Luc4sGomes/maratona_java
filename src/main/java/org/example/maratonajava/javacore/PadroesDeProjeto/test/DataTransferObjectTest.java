package org.example.maratonajava.javacore.PadroesDeProjeto.test;

import org.example.maratonajava.javacore.PadroesDeProjeto.Enums.Country;
import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Aircraft;
import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Person;

public class DataTransferObjectTest {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("111-222");
        Country country = Country.BRAZIL;
//        Currency currency = CurrencyFactory.newCurrency(country);

        Person person = Person.PersonBuilder.builder()
                .firstName("lucas")
                .lastName("nascimento")
                .build();


    }
}
