package org.example.maratonajava.javacore.Bintroductionmetodos.test;

import org.example.maratonajava.javacore.Bintroductionmetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("calors");
        funcionario.setAge(22);
        funcionario.setSalary(new double[] {10,10,10});

        funcionario.imprime();
        funcionario.averageSalarys();
    }
}
