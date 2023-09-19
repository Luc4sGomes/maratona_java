package org.example.maratonajava.introduction;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 17;
        boolean isAuthorizedBuyDrink = age >=18;
        if (isAuthorizedBuyDrink) {
            System.out.println("Can buy bear :)");
        }
        if(!isAuthorizedBuyDrink) {
            System.out.println("Cant buy a drink :(");
        }
        System.out.println("continue...");
    }
}
