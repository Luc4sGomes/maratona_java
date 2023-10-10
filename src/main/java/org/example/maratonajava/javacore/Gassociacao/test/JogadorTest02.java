package org.example.maratonajava.javacore.Gassociacao.test;

import org.example.maratonajava.javacore.Gassociacao.domain.Jogador;
import org.example.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        jogador1.imprime();
        Time time = new Time("seleção brasileira");

        jogador1.setTime(time);

    }
}
