package org.example.maratonajava.introduction;

public class Aula06Exercicio {
    public static void main(String[] args) {
        //dado os valores de 1 a 7 imprima se é dia util ou final de semana

        byte dayOfWeek = 1;
        switch (dayOfWeek) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("invalid");
                break;
        }

        //imprimir todos os numeros pares ate 1000;
        int value = 0;
        for(int variableIncrement = 0; variableIncrement < 1000; variableIncrement++) {
            if(value % 2 == 0) {
                System.out.println(value+" is par");
            }
            else {
                System.out.println(value+" is not par");
            }
            value ++;
        }

    }
}
