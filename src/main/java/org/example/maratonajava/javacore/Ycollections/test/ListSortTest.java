package org.example.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("atack on titan");
        mangas.add("one punch man");
        mangas.add("berserk");
        mangas.add("nanatsu no tazai");
        mangas.add("yosuga no sora");
        Collections.sort(mangas);

        List<Double> numeros = new ArrayList<>();
        numeros.add(4.0);
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(1.0);
        Collections.sort(numeros);
        System.out.println(numeros);

        for (String manga : mangas
        ) {
            System.out.println(manga);
        }
    }
}
