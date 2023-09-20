package org.example.maratonajava.introduction;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "lucas";
        names[1] = "carlos";
        names[2] = "fagner";
        names[3] = "valber";

        for (int variableIncrement = 0; variableIncrement < names.length ; variableIncrement++) {
            System.out.println(names[variableIncrement]);
        }
    }
}
