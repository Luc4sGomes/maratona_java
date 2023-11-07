package org.example.maratonajava.javacore.Labstratas.dominio;

public class RH extends Funcionario{

    public RH(String name, double salario){
        super(name,salario);
    }

    @Override
    public void calculaBonus() {

    }

    @Override
    public String toString() {
        return "RH{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
