package org.example.maratonajava.javacore.ZZDoptional.test;

import org.example.maratonajava.javacore.ZZDoptional.domain.Manga;
import org.example.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("one punch");
        mangaByTitle.ifPresent(manga -> manga.setTitle("one punch 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Evangellion").orElse(new Manga(3, "Evangellion", 20));
        System.out.println(newManga);

    }
}
