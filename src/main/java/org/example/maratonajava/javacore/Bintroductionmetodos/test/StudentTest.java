package org.example.maratonajava.javacore.Bintroductionmetodos.test;

import org.example.maratonajava.javacore.Bintroductionmetodos.dominio.ImprimeStudent;
import org.example.maratonajava.javacore.Bintroductionmetodos.dominio.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        ImprimeStudent imprimeStudent = new ImprimeStudent();

        student1.imprime();
    }
}
