package org.example.maratonajava.javacore.PWrappers.test;

public class Wrapper01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100D;
        char charP = 'p';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer integerW = 1; //autoboxing;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'p';
        Boolean booleanW = true;

        Character male = 'M';

        int i = integerW.intValue(); // unboxing;
        Integer intW2 = Integer.parseInt("1");
        Float convertedWrap = Float.parseFloat("100");
        boolean verdadeiro = Boolean.parseBoolean("true");


    }
}
