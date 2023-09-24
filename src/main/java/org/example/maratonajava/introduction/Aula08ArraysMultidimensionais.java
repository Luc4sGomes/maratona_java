package org.example.maratonajava.introduction;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //arrays multidimensionais nada mais sao que arrays de arrays, que estao linkados
        int[][] days = new int[2][3];
        days[0][0] = 31;
        days[0][1] = 21;
        days[0][2] = 11;
        
        days[1][0] = 9;
        days[1][1] = 8;
        days[1][2] = 7;



        for (int[] arrayBase: days
             ) {
            for (int num: arrayBase){
                System.out.println(num);
            }
        }

    }
}
