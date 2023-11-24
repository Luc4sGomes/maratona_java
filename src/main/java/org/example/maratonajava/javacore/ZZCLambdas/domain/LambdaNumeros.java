package org.example.maratonajava.javacore.ZZCLambdas.domain;

import java.util.ArrayList;
import java.util.List;

public class LambdaNumeros {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.forEach((number) -> System.out.println(number));
    }
}
