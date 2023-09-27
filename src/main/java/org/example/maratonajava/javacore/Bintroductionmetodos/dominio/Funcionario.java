package org.example.maratonajava.javacore.Bintroductionmetodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] salary;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary != null) {
            for (double salario : salary
            ) {
                System.out.println("salary: " + salario);
            }
        }
        averageSalarys();
    }

    public void averageSalarys() {
        if (salary == null) {
            return;
        }

        int keepSum = 0;
        for (int i = 0; i < salary.length; i++) {
            keepSum += salary[i];
        }

        System.out.println(keepSum / salary.length);


    }


}
