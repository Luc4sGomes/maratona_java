package org.example.maratonajava.javacore.ZZEstreams.test;

import org.example.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest {
    private static List<LightNovel> lightNovels = List.of(new LightNovel("Overload", 1.00),
            new LightNovel("Overload", 1.00),
            new LightNovel("Nanatsu no Tazai", 21.99),
            new LightNovel("Naruto", 3.40),
            new LightNovel("Berserk", 59.90),
            new LightNovel("One Punch", 35.50));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titleNovel = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titleNovel.add(lightNovel.getTitle());
            }
            if (titleNovel.size() >= 3) {
                break;
            }
        }


        System.out.println(lightNovels);
        System.out.println(titleNovel);
    }

}
