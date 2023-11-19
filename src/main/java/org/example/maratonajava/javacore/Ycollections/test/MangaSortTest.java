package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L, "Naruto", 1.90));
        mangas.add(new Manga(2L, "Yosuga no sora", 19.90));
        mangas.add(new Manga(1L, "Berserk", 49.90));
        mangas.add(new Manga(4L, "One Punch Man!", 25.90));


        Collections.sort(mangas, new MangaByIdComparator());


        for (Manga manga : mangas
        ) {
            System.out.println(manga);
        }
    }
}
