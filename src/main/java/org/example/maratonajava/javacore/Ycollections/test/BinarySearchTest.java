package org.example.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(2);
        numerosInteiros.add(40);
        numerosInteiros.add(70);
        numerosInteiros.add(10);
        numerosInteiros.add(50);
        numerosInteiros.add(30);

        //(-(ponto de inserção) -1);

        Collections.sort(numerosInteiros);
//        System.out.println(Collections.binarySearch(numerosInteiros));
    }
}
