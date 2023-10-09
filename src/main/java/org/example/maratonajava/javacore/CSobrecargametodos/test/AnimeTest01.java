package org.example.maratonajava.javacore.CSobrecargametodos.test;

import org.example.maratonajava.javacore.CSobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Manga","terror", "1", 1);
        anime.setType("Manga");
        anime.setEps(1);
        anime.imprime();
    }
}
