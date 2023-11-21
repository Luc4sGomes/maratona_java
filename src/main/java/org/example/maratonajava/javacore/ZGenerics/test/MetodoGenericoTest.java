package org.example.maratonajava.javacore.ZGenerics.test;

import org.example.maratonajava.javacore.Ycollections.domain.Manga;
import org.example.maratonajava.javacore.ZGenerics.domain.Barco;
import org.example.maratonajava.javacore.ZGenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {
    public static void main(String[] args) {

        Barco barco = new Barco("Iate do gugu");
        keepListOfThings(barco);

        Carro carro = new Carro("BMW");
        keepListOfThings(carro);

        Manga manga = new Manga(1L, "berserk", 159.90);
        keepListOfThings(manga);


    }

    private static <X> List<X> keepListOfThings(X x) {
        List<X> xArrayList = new ArrayList<>();
        xArrayList.add(x);
        iteratorInArray(xArrayList);
        return xArrayList;

    }


    private static <X> void iteratorInArray(List<X> xArrayList) {
        for (X objeto : xArrayList
        ) {
            System.out.println("este é o objeto: " + objeto);
        }
    }

}



