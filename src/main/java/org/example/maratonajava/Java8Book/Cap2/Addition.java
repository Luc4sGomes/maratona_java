package org.example.maratonajava.Java8Book.Cap2;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println(sum + " :p");

        while (sum < 1000) {

            System.out.println("Write your first number to sum:");
            int firstNumberUser = scanner.nextInt();

            System.out.println("Write your second number to sum:");
            int secondNumberUser = scanner.nextInt();

            int x = firstNumberUser + secondNumberUser;
            sum += x;


            System.out.println("your sum is: " + sum + "!");


            if (sum == 1000) {
                scanner.close();
                break;
            }


        }


    }
}
