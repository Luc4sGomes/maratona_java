package org.example.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodios;

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for (int episodio : Anime.episodios) {
            System.out.println(episodio + "");
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
