package org.example.maratonajava.javacore.Oexception.RuntimeException.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
            reader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } finally {
             reader.close();
        }
    }



}
