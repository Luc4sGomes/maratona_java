package org.example.maratonajava.javacore.Bintroductionmetodos.test;

import org.example.maratonajava.javacore.Bintroductionmetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.sumValueNumbers();
        calc.subtraiTwoNumbers();
        calc.multiplicaTwoNumbers(19, 19);
        double keepResultMath = calc.divideTwoNumbers(2, 0);
        System.out.println(keepResultMath);

        calc.imprimiDivisionTwoNumbers(2, 0);
    }
}
