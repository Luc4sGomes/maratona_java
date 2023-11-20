package org.example.maratonajava.javacore.Ycollections.test;

import org.example.maratonajava.javacore.Ycollections.domain.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<String, Consumidor> map = new TreeMap<>();

        Consumidor consumidor1 = new Consumidor("Peu da galinha");
        Consumidor consumidor2 = new Consumidor("Valmir");
        Consumidor consumidor3 = new Consumidor("Louro da barraquinha");

        map.put("A", consumidor1);

//        map.put("A", "Letra A");
//        map.put("D", "Letra D");
//        map.put("Q", "Letra Q");
//        map.put("E", "Letra E");
//        map.put("G", "Letra G");

        for (Map.Entry<String, Consumidor> entry : map.entrySet()
        ) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println(map.headMap("C").remove("A"));
    }
}
