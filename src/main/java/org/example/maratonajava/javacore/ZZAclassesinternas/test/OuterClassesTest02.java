package org.example.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String nome = "Saitama";

    void print() {
        class OnePunch {
            public void printLocal() {
                System.out.println(nome);
            }
        }
        OnePunch onePunch = new OnePunch();
        onePunch.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();

    }
}
