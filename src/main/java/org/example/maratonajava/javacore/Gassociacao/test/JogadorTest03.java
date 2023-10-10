package org.example.maratonajava.javacore.Gassociacao.test;

import org.example.maratonajava.javacore.Gassociacao.domain.Jogador;
import org.example.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Romario");
        Time time =  new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("- - -  Jogador");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("- - -  Time");
        time.imprime();
    }
}
