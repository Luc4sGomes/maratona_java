package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();

        mangas.add(new Manga(3L, "Naruto", 1.90, 1));
        mangas.add(new Manga(2L, "Yosuga no sora", 19.90, 5));
        mangas.add(new Manga(1L, "Berserk", 49.90, 10));
        mangas.add(new Manga(4L, "One Punch Man!", 25.90, 0));
        mangas.add(new Manga(4L, "One Punch Man!", 25.90, 0));

        for (Manga manga: mangas
             ) {
            System.out.println(manga);
        }
    }
}
