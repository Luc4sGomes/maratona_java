package org.example.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> nomesArray = new ArrayList<>();
        List<String> nomesArray2 = new ArrayList<>();

        nomesArray.add("Lucas");
        nomesArray.add("Joao");
        nomesArray.add("Maria");


        nomesArray2.addAll(nomesArray);
        System.out.println(nomesArray2);

        for (String nome : nomesArray
        ) {
            System.out.println(nome.length());
        }

        nomesArray.add("suane");

        System.out.println("- - - - - - - - - - ");

        for (int i = 0; i < nomesArray.size(); i++) {
            System.out.println(nomesArray.get(i));
        }

        nomesArray.remove(3);

        System.out.println("- - - - - - - - - - ");

        System.out.println(nomesArray);
    }
}
