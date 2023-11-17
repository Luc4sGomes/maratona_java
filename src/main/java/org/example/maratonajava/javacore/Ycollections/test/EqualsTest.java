package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("12234", "samsung");
        Smartphone smartphone2 = new Smartphone("12234", "samsung");
        System.out.println(smartphone.equals(smartphone2));

        String n1 = "lucas";
        String n2 = "lucas";

        String m1 = new String("gomes");
        String m2 = new String("    false");

        System.out.println(m2);
        System.out.println(n1 == n2);

        System.out.println(m1 == m2);
        System.out.println(m1 == n1);
        System.out.println(m2 == n2);

        System.out.println("-------------------------");

        System.out.println(n1.equals(n2));
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(n1));
        System.out.println(m2.equals(n2));

    }
}
