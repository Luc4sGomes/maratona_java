package org.example.maratonajava.javacore.Labstratas.test;

import org.example.maratonajava.javacore.Labstratas.dominio.Funcionario;
import org.example.maratonajava.javacore.Labstratas.dominio.Gerente;
import org.example.maratonajava.javacore.Labstratas.dominio.RH;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("nami", 5000);
        System.out.println(gerente);

        RH rh = new RH("kelly", 40500);
        System.out.println(rh);
    }
}
