package org.example.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

class Cachorro extends Animal {
    @Override
    public void walk() {
        super.walk();
    }
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("walking like human");
            }
        };
        animal.walk();
    }
}
