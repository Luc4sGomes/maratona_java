package org.example.maratonajava.javacore.ZZCLambdas.test;

import org.example.maratonajava.javacore.ZZCLambdas.domain.Anime;
import org.example.maratonajava.javacore.ZZCLambdas.domain.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> anime = new ArrayList<>();
        anime.add(new Anime("Berserk", 19));
        anime.add(new Anime("One punch man", 46));
        anime.add(new Anime("Naruto", 400));


        anime.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(anime);
    }
}
