package org.example.maratonajava.introduction;

public class Aula04Operadores {
    public static void main(String[] args) {

        //operadores aritimeticos + - / *
        int number1 = 10;
        double number2 = 20;
        double result = number1/number2;
        System.out.println(number1+number2);
        int salary = (int) 1222.2;

        //operadores relacionais

        int rest = 20 % 2;
        System.out.println(rest);

        //operadores logicos, sempre retornar um valor boolean true or false < >, <= >= == !=
        boolean isBiggerThanTen = 10 > 20;
        System.out.println(isBiggerThanTen);

    }
}
