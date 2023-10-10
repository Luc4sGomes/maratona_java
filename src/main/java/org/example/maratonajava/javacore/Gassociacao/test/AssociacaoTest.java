package org.example.maratonajava.javacore.Gassociacao.test;

import org.example.maratonajava.javacore.Gassociacao.domain.Aluno;
import org.example.maratonajava.javacore.Gassociacao.domain.Local;
import org.example.maratonajava.javacore.Gassociacao.domain.Professor;
import org.example.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno =  new Aluno("lucas", 22);
        Aluno[] alunosParaSeminario = {aluno};

        Professor professor =  new Professor("Daniel faustino", "Segurança");
        Seminario seminario =  new Seminario("Onde achar a segurança nos sistemas", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
