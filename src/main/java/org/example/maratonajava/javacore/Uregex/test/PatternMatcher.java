package org.example.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "aaabbababa";
        Pattern pattern = Pattern.compile("ab");

        Matcher matcher = pattern.matcher(text);

        System.out.println("texto:   "+text);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("posicoes encontradas >");

        while (matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
