package org.example.maratonajava.javacore.ZZCLambdas.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdasConsumer {
    public static void main(String[] args) {
        List<String> dataBaseNames = new ArrayList<>();
        dataBaseNames.add("Lucas Gomes Melo Nascimento");
        dataBaseNames.add("Alzineide Gomes Barbosa");
        dataBaseNames.add("Luiz Melo do Nascimento");


        Consumer<String> keepNamesDataBase = ((name) -> System.out.println(name));
        dataBaseNames.forEach(keepNamesDataBase);
    }
}
