package org.example.maratonajava.javacore.Aintroductionclasses.test;

import org.example.maratonajava.javacore.Aintroductionclasses.doming.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professorJuvenal = new Professor();
        professorJuvenal.name = "Juvenal";
        professorJuvenal.age = 59;
        professorJuvenal.sex = 'M';

        System.out.print(professorJuvenal.name + " " + professorJuvenal.age + " " + professorJuvenal.sex);
    }
}
