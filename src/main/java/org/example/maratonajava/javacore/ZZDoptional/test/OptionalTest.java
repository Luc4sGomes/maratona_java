package org.example.maratonajava.javacore.ZZDoptional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha Uhu o maraca é nosso");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("- - - - -");

        Optional<String> name = findName("Lucas");
        String vazia = name.orElse("VAZIA");
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(name);
        System.out.println(vazia);
    }

    private static Optional<String> findName(String name) {
        List<String> namesUsers = new ArrayList<>();
        namesUsers.add("Lucas Gomes Melo Nascimento");
        namesUsers.add("Alzineide Gomes Barbosa");
        namesUsers.add("Luiz Melo do Nascimento");

        int index = namesUsers.indexOf(name);

        if (index != 1) {
            return Optional.of(namesUsers.get(index));
        }

        return Optional.empty();
    }
}
