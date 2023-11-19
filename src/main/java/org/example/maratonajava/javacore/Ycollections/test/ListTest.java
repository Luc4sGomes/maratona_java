package org.example.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> nomesArray = new ArrayList<>();
        nomesArray.add("Lucas");
        nomesArray.add("Joao");
        nomesArray.add("Maria");

        for (String nome : nomesArray
        ) {
            System.out.println(nome.length());
        }

        nomesArray.add("suave");

        System.out.println("- - - - - - - - - - ");

        for(int i = 0; i < nomesArray.size(); i++){
            System.out.println(nomesArray.get(i));
        }
    }
}
