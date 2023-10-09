package org.example.maratonajava.javacore.Eblocosinicializacao.test;

import org.example.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("naruto");
        System.out.println(anime.getEpisodios());
    }
}
