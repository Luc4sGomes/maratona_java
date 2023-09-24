package org.example.maratonajava.javacore.Aintroductionclasses.test;

import org.example.maratonajava.javacore.Aintroductionclasses.doming.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student studentAlive = new Student();
        studentAlive.name = "Lucas";
        studentAlive.age = 22;
        studentAlive.sex = 'M';

        System.out.println(studentAlive.name);
        System.out.println(studentAlive.age);
        System.out.println(studentAlive.sex);
    }
}
