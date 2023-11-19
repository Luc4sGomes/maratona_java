package org.example.maratonajava.javacore.Ycollections.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mapa = new LinkedHashMap<>();

        mapa.put("teklado", "teclado");
        mapa.put("mouze", "mouse");
        mapa.put("vose", "voce");
        mapa.putIfAbsent("vose2", "voce2");

        System.out.println(mapa);
        System.out.println(" imprimindo ->");

        for (String key : mapa.keySet()) {
            System.out.println(key + " : " + mapa.get(key));
        }

        System.out.println("- - - - - - -");

        for (String value : mapa.values()
        ) {
            System.out.println(value);
        }

        System.out.println("- - - - - - - ");

        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
