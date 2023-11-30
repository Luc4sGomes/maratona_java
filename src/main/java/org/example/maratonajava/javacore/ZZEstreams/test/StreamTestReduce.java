package org.example.maratonajava.javacore.ZZEstreams.test;

import java.util.List;
import java.util.Optional;

public class StreamTestReduce {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 4, 5, 6);

        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));


    }
}
