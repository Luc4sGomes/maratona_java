package org.example.maratonajava.javacore.Labstratas.test;

import org.example.maratonajava.javacore.Labstratas.dominio.Desenvolvedor;
import org.example.maratonajava.javacore.Labstratas.dominio.Funcionario;
import org.example.maratonajava.javacore.Labstratas.dominio.Gerente;
import org.example.maratonajava.javacore.Labstratas.dominio.RH;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("nami", 5000);
        RH rh = new RH("kelly", 40500);
        Desenvolvedor dev1 = new Desenvolvedor("lucas", 3400.00);


        System.out.println(gerente);
        System.out.println(rh);
        System.out.println(dev1);
    }
}
