package org.example.maratonajava.javacore.ZZCLambdas.test;

import org.example.maratonajava.javacore.ZZCLambdas.domain.Anime;
import org.example.maratonajava.javacore.ZZCLambdas.domain.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>();
        anime.add(new Anime("Berserk", 19));
        anime.add(new Anime("One punch man", 46));
        anime.add(new Anime("Naruto", 400));


//        Collections.sort(anime, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(anime, AnimeComparator::compareByTitle);
        Collections.sort(anime, AnimeComparator::compareByEpisodes);
        System.out.println(anime);


    }
}
