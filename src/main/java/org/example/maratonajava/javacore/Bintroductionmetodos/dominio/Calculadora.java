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

}
