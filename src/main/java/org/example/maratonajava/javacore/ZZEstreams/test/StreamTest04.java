package org.example.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> escola = new ArrayList<>();
        List<String> graphicDesigners = List.of("Deived", "Neto", "Marcia");
        List<String> developers = List.of("Lucas", "bruno", "Marcio");
        List<String> students = List.of("edipo", "gustavo", "jojo");

        escola.add(graphicDesigners);
        escola.add(developers);
        escola.add(students);

        for (List<String> people : escola) {
            for (String person : people) {
                System.out.println(person);
            }

        }

        escola.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
