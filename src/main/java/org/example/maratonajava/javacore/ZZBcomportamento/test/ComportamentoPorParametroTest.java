package org.example.maratonajava.javacore.ZZBcomportamento.test;

import org.example.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest {
    private static List<Car> cars = List.of(
            new Car("red", 1998),
            new Car("black", 2001),
            new Car("green", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));

        System.out.println("- - - - - - - ");

        System.out.println(filterCarByAge(cars, 2010));

    }


    private static List<Car> filterGreenCar(List<Car> listCar) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : listCar) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }

        return greenCars;

    }

    private static List<Car> filterRedCar(List<Car> listCar) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : listCar) {
            if (car.getColor().equals("green")) {
                redCars.add(car);
            }
        }

        return redCars;

    }

    private static List<Car> filterCarByColor(List<Car> listCar, String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : listCar) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }

        return filterCar;

    }

    private static List<Car> filterCarByAge(List<Car> listCar, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : listCar) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }

        return oldCars;

    }


}
