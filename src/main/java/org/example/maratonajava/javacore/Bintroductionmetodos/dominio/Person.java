package org.example.maratonajava.javacore.Bintroductionmetodos.dominio;

public class Person {
    private String name;
    private int age;

    public void imprime() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if(age < 0) {
            System.out.println("error");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
