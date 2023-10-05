package org.example.maratonajava.javacore.Bintroductionmetodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salary;
    private double average;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
