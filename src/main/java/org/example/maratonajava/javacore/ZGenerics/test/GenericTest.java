package org.example.maratonajava.javacore.ZGenerics.test;


import org.example.maratonajava.javacore.Ycollections.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("one punch");
        lista.add("Naruto");


        add(lista, new Consumidor("Yosuga no Sora"));

        for (Object string : lista
        ) {
            System.out.println(string);
        }
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
