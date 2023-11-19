package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Pessoa;
import org.example.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class EqualsTest {
    public static void main(String[] args) {

//        Smartphone smartphone = new Smartphone("12234", "samsung");
//        Smartphone smartphone2 = new Smartphone("12234", "samsung");
//        System.out.println(smartphone.equals(smartphone2));
//
//        String n1 = "lucas";
//        String n2 = "lucas";
//
//        String m1 = new String("gomes");
//        String m2 = new String("    false");
//
//        System.out.println(m2);
//        System.out.println(n1 == n2);
//
//        System.out.println(m1 == m2);
//        System.out.println(m1 == n1);
//        System.out.println(m2 == n2);
//
//        System.out.println("-------------------------");
//
//        System.out.println(n1.equals(n2));
//        System.out.println(m1.equals(m2));
//        System.out.println(m1.equals(n1));
//        System.out.println(m2.equals(n2));

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoaLucas = new Pessoa("Lucas Gomes Melo Nascimento", 1L);
        Pessoa pessoaNeide = new Pessoa("Alzineide Gomes Barbosa", 2L);
        Pessoa pessoaLuiz = new Pessoa("Luiz Melo do Nascimento", 3L);

        pessoas.add(pessoaLucas);
        pessoas.add(pessoaNeide);
        pessoas.add(pessoaLuiz);
        pessoas.add(pessoaNeide); //ele vai adicionar repetido mesmo que seja igual

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " " + pessoa.getId());
        }
    }
}
