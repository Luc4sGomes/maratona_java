package org.example.maratonajava.introduction;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while e for, podemos usar para iterar sobre alguma coisa, por exemplo, fazer algo conta te 10;
        int count = 0;
        while (count <= 10) {
            count++;
            System.out.println(count);
        }


        //executa pelo menos uma vez
        do {
            System.out.println("dentro do do while");
        }
        while (count <= 10);


        //for
        for (int variableIncrement = 0; variableIncrement < 10; variableIncrement++) {
            System.out.println("incrementing... " + variableIncrement);
        }



    }
}
