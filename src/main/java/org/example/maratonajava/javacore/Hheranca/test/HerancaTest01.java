package org.example.maratonajava.javacore.Hheranca.test;

import org.example.maratonajava.javacore.Hheranca.domain.Endereco;
import org.example.maratonajava.javacore.Hheranca.domain.Funcionario;
import org.example.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("58297000");
        endereco.setRua("sao paulo");

        Pessoa pessoa = new Pessoa();
        pessoa.setName("Lucas");
        pessoa.setCpf("111.111.111.52");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setName("joao");
        funcionario.setCpf("22222");
        funcionario.setSalario(121233);
        funcionario.setEndereco(endereco);


        pessoa.imprime();

    }
}
