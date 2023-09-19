package org.example.maratonajava.introduction;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyDrink = age >= 18;
        String category;


        if (age < 15) {
            category = "category infantil";
        } else if (age >= 15 && age < 18) {
            category = "category juvenil";
        } else {
            category = "category adult";
        }
        System.out.println(category);
    }
}
