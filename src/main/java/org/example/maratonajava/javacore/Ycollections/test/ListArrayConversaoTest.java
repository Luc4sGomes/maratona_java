package org.example.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] integersArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integersArray));

        Integer[] numerosArray = new Integer[2];
        numerosArray[0] = 1;
        numerosArray[1] = 2;

        List<Integer> ListArray = Arrays.asList(numerosArray);
        System.out.println();
    }
}
