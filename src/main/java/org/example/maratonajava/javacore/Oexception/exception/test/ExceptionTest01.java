package org.example.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() {
        File arquivo = new File("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\maratona-java\\src\\main\\java\\org\\example\\maratonajava\\javacore\\Oexception\\arquivo\\teste.txt");

        try {
            boolean isCriado = arquivo.createNewFile();
            System.out.println("arquivo criado: " + isCriado);

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
