package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Samsung");
        set.add(smartphone);
        System.out.println(set);

    }
}
