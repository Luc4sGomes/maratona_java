package org.example.maratonajava.javacore.ZZCLambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Saitama", "Guts");
        List<Integer> mapearInteiros = mapear(strings, (String s) -> s.length());
        List<Integer> forEachInteger = new ArrayList<>();
        forEachInteger.add(100);
        forEachInteger.add(200);
        forEachInteger.add(300);
        forEachInteger.add(400);


        Consumer<Integer> keepListInteger = (n) -> System.out.println(n);
        forEachInteger.forEach(keepListInteger);


        System.out.println(mapearInteiros);

        List<String> mapearUpper = mapear(strings, s -> s.toUpperCase());
        System.out.println(mapearUpper);
    }

    private static <T, R> List<R> mapear(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            R r = function.apply(element);
            result.add(r);
        }

        return result;
    }
}
