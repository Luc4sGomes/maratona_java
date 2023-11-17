package org.example.maratonajava.javacore.Xserializacao.test;

import org.example.maratonajava.javacore.Xserializacao.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest {
    private static Aluno alunoMarcilioDias;

    public static void main(String[] args) {

        Aluno alunoMarcilioDias = new Aluno(1L, "Mauricio", "1356635");
        descerializar();

    }

    private static void serializar(Aluno aluno) {

        Path path = Paths.get("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\maratona-java\\src\\main\\java\\org\\example\\maratonajava\\javacore\\Xserializacao\\aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void descerializar() {

        Path path = Paths.get("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\maratona-java\\src\\main\\java\\org\\example\\maratonajava\\javacore\\Xserializacao\\aluno.ser");
        try(ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) oos.readObject();
            System.out.println(aluno);

        } catch (IOException  | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
