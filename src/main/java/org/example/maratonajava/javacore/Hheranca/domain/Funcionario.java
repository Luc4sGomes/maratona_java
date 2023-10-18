package org.example.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String name) {
        super(name);
    }

    public Funcionario(String name, String cpf) {
        super(name, cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatarPagamento() {
        System.out.println("eu " + this.name + "recebi o salario de " + this.salario);
    }
}
