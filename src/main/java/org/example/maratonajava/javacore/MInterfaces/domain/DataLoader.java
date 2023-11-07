package org.example.maratonajava.javacore.MInterfaces.domain;

public interface DataLoader{

    void load();
    default void isPermisson(){
        System.out.println("fazendo checagem de permissoes");
    };
}
