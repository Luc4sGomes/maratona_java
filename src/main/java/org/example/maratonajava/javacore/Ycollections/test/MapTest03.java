package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Consumidor;
import org.example.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Peu da galinha");
        Consumidor consumidor2 = new Consumidor("Valmir");
        Consumidor consumidor3 = new Consumidor("Louro da barraquinha");

        Manga manga1 = new Manga(1L, "Berserk", 99.0);
        Manga manga2 = new Manga(2L, "Nanatsu no tazai", 19.0);
        Manga manga3 = new Manga(3L, "Naruto", 80.0);
        Manga manga4 = new Manga(4L, "one punch man", 70.0);
        Manga manga5 = new Manga(5L, "helsing", 39.0);

        List<Manga> mangasComprados1 = List.of(manga1, manga5);
        List<Manga> mangasComprados2 = List.of(manga2, manga3);
        List<Manga> mangasComprados3 = List.of(manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new LinkedHashMap<>();

        consumidorMangaMap.put(consumidor1, mangasComprados1);
        consumidorMangaMap.put(consumidor2, mangasComprados2);
        consumidorMangaMap.put(consumidor3, mangasComprados3);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()
        ) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }


        }


    }
}
