package org.example.maratonajava.javacore.ZZEstreams.test;

import org.example.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = List.of(new LightNovel("Overload", 1.00),
            new LightNovel("Nanatsu no Tazai", 21.99),
            new LightNovel("Naruto", 3.40),
            new LightNovel("Berserk", 59.90),
            new LightNovel("One Punch", 35.50));

    public static void main(String[] args) {

        List<String> titles = lightNovels.stream().sorted(Comparator.comparing(LightNovel::getTitle)).
                filter(ln -> ln.getPrice() <= 4).
                limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);


    }

}
