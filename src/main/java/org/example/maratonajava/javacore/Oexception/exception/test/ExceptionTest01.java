package org.example.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
        fakeBin("111");

    }

    private static void criarNovoArquivo() throws IOException{
        File arquivo = new File("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\maratona-java\\src\\main\\java\\org\\example\\maratonajava\\javacore\\Oexception\\arquivo\\teste.txt");

        try {
            boolean isCriado = arquivo.createNewFile();
            System.out.println("arquivo criado: " + isCriado);

        } catch (IOException exception) {
            exception.printStackTrace();
            throw exception;
        }

    }

    private static void fakeBin(String numberString){
        System.out.println(numberString.length());


    }
}
