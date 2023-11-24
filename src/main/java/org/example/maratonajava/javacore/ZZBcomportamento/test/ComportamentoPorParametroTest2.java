package org.example.maratonajava.javacore.ZZBcomportamento.test;

import org.example.maratonajava.javacore.ZZBcomportamento.domain.Car;
import org.example.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest2 {
    private static List<Car> cars = List.of(
            new Car("red", 1998),
            new Car("black", 2001),
            new Car("green", 2019));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
//
//        System.out.println(greenCars);


        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2019);
        List<Car> greenCarsRed = filter(cars, car -> car.getColor().equals("red"));
        List<Car> greenCarsBlack = filter(cars, car -> car.getColor().equals("black"));

        List<Car> filteredCar = filter(cars, car -> car.getColor().equals("green"));


        System.out.println(yearBeforeCars);
        System.out.println(greenCarsRed);
        System.out.println(greenCarsBlack);

        List<Integer> nums = List.of(1, 10, 200, 400, 500);

        System.out.println(filterGenericCar(nums, num -> num % 2 == 0));


    }


    private static List<Car> filter(List<Car> listCar, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : listCar) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }

        return filterCar;

    }

    private static <T> List<T> filterGenericCar(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }

        return filteredList;
    }


}
