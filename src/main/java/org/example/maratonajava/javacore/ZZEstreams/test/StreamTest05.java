package org.example.maratonajava.javacore.ZZEstreams.test;

import org.example.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.List;
import java.util.Optional;

public class StreamTest05 {
    private static List<LightNovel> lightNovels = List.of(new LightNovel("Overload", 1.00),
            new LightNovel("Nanatsu no Tazai", 21.99),
            new LightNovel("Naruto", 3.40),
            new LightNovel("Berserk", 59.90),
            new LightNovel("One Punch", 35.50));


    public static void main(String[] args) {

        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() < 0));

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);


    }
}
