package org.example.maratonajava.javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Lucas";
        String numeros = "012345    ";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("u","a"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.length());
        System.out.println(numeros.substring(1,3));
        System.out.println(numeros.trim());
    }
}
