package org.example.maratonajava.javacore.Bintroductionmetodos.dominio;

public class Calculadora {
    public void sumValueNumbers() {
        System.out.println(10+10);
    }

    public void subtraiTwoNumbers() {
        System.out.println(10-5);
    }

    public void multiplicaTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        return num1/num2;
    }

    public void imprimiDivisionTwoNumbers(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("not exists division to zero");
            return;
        }
        else {
            System.out.println(num1/num2);
        }
    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("inside of change two number");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }

    public void sumArray(int[] numeros) {
        int soma = 0;
        for (int aux: numeros
             ) {
            soma += aux;
        }
        System.out.println(soma);
    }

    public void sumVarArgs(int...numeros) {
        int soma = 0;
        for (int aux: numeros
        ) {
            soma += aux;
        }
        System.out.println(soma);
    }

}
