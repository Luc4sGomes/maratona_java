package org.example.maratonajava.javacore.ZZAclassesinternas.test;

public class InnerClassesTest {
    private String name = "Saitama";

    class InnerdoInner {
        public void printOuterClassAttribute() {
            System.out.println(name);
        }
    }


    public static void main(String[] args) {
        InnerClassesTest innerClassesTest = new InnerClassesTest();
        InnerdoInner innerdoInner = innerClassesTest.new InnerdoInner();

        new InnerClassesTest().new InnerdoInner();

        innerdoInner.printOuterClassAttribute();
    }
}
