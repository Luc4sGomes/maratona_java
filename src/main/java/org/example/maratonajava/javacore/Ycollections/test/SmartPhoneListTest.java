package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartPhoneListTest {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "samsung");
        Smartphone s2 = new Smartphone("22222", "apple");
        Smartphone s3 = new Smartphone("33333", "pixel");

        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);



        for (Smartphone smartphone : smartphones
        ) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("33333", "pixel");
        System.out.println(smartphones.contains(s4));

    }
}
