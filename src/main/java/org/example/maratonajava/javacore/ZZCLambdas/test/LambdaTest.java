package org.example.maratonajava.javacore.ZZCLambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> strings = List.of("Lucas", "Saitama", "Naruto");
        List<Integer> numbersInteger = List.of(1, 2, 3);


        forEach(numbersInteger, nums -> System.out.println(nums));
        forEach(strings, string -> System.out.println(string));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T element : list) {
            consumer.accept(element);
        }


    }


}
