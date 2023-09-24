package org.example.maratonajava.introduction;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers2 = {1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 101, 2923, 303, 304, 450};

        for (int variableIncrement = 0; variableIncrement < numbers2.length; variableIncrement++) {
            System.out.println(numbers2[variableIncrement]);
        }


        //em um for each, voce nao consegue acessar o indice dos valores do array...
        for (int number :
                numbers2) {
            System.out.println(number);

        }

    }
}
