package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();

        Pessoa pessoaMaria = new Pessoa("Maria do Carmo Santos", 4L);
        Pessoa pessoaSeverino = new Pessoa("Severino Gomes Barbosa", 5L);
        Pessoa pessoaSalete = new Pessoa("Salete Gomes Barbosa", 6L);
        Pessoa pessoaSeverino2 = new Pessoa("Severino Gomes Barbosa", 5L); //diferente do List, ele nao iria adicionar o objeto repetido

        pessoas.add(pessoaMaria);
        pessoas.add(pessoaSeverino);
        pessoas.add(pessoaSalete);

        System.out.println(pessoas);

        for (Pessoa pessoa : pessoas
        ) {
            System.out.println(pessoa.getNome() + " " + pessoa.getId());
        }
    }
}
