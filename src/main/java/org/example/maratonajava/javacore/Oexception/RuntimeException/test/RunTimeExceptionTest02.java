package org.example.maratonajava.javacore.Oexception.RuntimeException.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    private static int divisao(int a, int b) throws IllegalArgumentException{

        if (b == 0) {
            throw new IllegalArgumentException("argumento invalido!");
        }

        return a / b;
    }
}
