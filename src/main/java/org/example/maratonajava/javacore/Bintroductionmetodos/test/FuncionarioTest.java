package org.example.maratonajava.javacore.Bintroductionmetodos.test;

import org.example.maratonajava.javacore.Bintroductionmetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name = "carlos";
        funcionario.age = 12;
        funcionario.salary = new double[]{20,20,40};

        funcionario.imprime();
        funcionario.averageSalarys();
    }
}
