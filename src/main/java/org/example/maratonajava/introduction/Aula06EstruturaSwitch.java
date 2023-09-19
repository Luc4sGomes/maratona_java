package org.example.maratonajava.introduction;

public class Aula06EstruturaSwitch {
    public static void main(String[] args) {
        //imprimir o dia da semana considerando 1 como domingo
        byte dayOfWeek = 50;
        switch (dayOfWeek) {
            case 1:
                System.out.println("day one");
                break;
            case 2:
                System.out.println("day two");
                break;
            case 3:
                System.out.println("day three");
                break;
            case 4:
                System.out.println("day four");
                break;
            case 5:
                System.out.println("day five");
                break;
            case 6:
                System.out.println("day six");
                break;

            default:
                System.out.println("opcao invalida");
                break;
        }
    }
}
