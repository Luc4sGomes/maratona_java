package org.example.maratonajava.javacore.Bintroductionmetodos.test;

import org.example.maratonajava.javacore.Bintroductionmetodos.dominio.Calculadora;

import java.lang.reflect.Array;
import java.util.List;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.sumValueNumbers();
        calc.subtraiTwoNumbers();
        calc.multiplicaTwoNumbers(19, 19);
        double keepResultMath = calc.divideTwoNumbers(2, 0);
        System.out.println(keepResultMath);

        calc.imprimiDivisionTwoNumbers(2, 0);

        int num1 = 1;
        int num2 = 2;

        calc.changeTwoNumbers(num1, num2);

        int[] arrayNumbers = {1,2,3,4,5,6};
        calc.sumArray(arrayNumbers);

        calc.sumVarArgs(1,2,3,4,5,6,7,8);

    }
}
