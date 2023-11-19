package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Consumidor;
import org.example.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Peu da galinha");
        Consumidor consumidor2 = new Consumidor("Valmir");
        Consumidor consumidor3 = new Consumidor("Louro da barraquinha");

        Manga manga1 = new Manga(1L, "Berserk", 99.0);
        Manga manga2 = new Manga(2L, "Nanatsu no tazai", 19.0);
        Manga manga3 = new Manga(3L, "Naruto", 80.0);
        Manga manga4 = new Manga(4L, "one punch man", 70.0);
        Manga manga5 = new Manga(5L, "helsing", 39.0);

        Map<Consumidor, Manga> consumidorMangaMap = new LinkedHashMap<>();
        consumidorMangaMap.put(consumidor1, manga2);
        consumidorMangaMap.put(consumidor2, manga1);
        consumidorMangaMap.put(consumidor3, manga4);

        for (Map.Entry<Consumidor, Manga> entry: consumidorMangaMap.entrySet()
             ) {
            System.out.println("O consumidor "+entry.getKey().getNome()+" comprou o manga: "+entry.getValue().getNome()+" Pelo preço:"+entry.getValue().getPreco());
        }

    }
}
