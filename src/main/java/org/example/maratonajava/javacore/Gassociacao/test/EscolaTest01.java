package org.example.maratonajava.javacore.Gassociacao.test;

import org.example.maratonajava.javacore.Gassociacao.domain.Escola;
import org.example.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("rodrigo rebouças");
        Professor[] professores = {professor};
        Escola escola = new Escola("UFPB", professores);
        escola.imprime();
    }
}
