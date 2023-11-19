package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();


        mangas.add(new Manga(3L, "Naruto", 1.90, 1));
        mangas.add(new Manga(2L, "Yosuga no sora", 19.90, 5));
        mangas.add(new Manga(1L, "Berserk", 49.90, 10));
        mangas.add(new Manga(4L, "One Punch Man!", 25.90, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if(manga.getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }

        System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 1);

        System.out.println("- - - - - - - - ");

        System.out.println(mangas);
    }
}
