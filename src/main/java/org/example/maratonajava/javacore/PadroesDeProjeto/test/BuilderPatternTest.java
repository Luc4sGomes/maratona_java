package org.example.maratonajava.javacore.PadroesDeProjeto.test;

import org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces.CarBuilder;
import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Car;
import org.example.maratonajava.javacore.PadroesDeProjeto.domain.CarBuilderImpl;
import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Director;
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


        //----------------------------------------------------


        CarBuilder carBuilder = new CarBuilderImpl();
        Director director = new Director(carBuilder);

        Car sportingCar = director.buildCarSporting();
        System.out.println("Sporting Car: " + sportingCar.getModel() + " " + sportingCar.getMotor() + " " + sportingCar.getYearOfManufacture());

        Car defaultCar = director.buildCarDefault();
        System.out.println("default Car: " + defaultCar.getModel() + " " + defaultCar.getMotor() + " " + defaultCar.getYearOfManufacture());
    }
}
