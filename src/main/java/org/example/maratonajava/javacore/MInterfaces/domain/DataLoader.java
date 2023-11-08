package org.example.maratonajava.javacore.MInterfaces.domain;

public interface DataLoader{

    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void isPermisson(){
        System.out.println("fazendo checagem de permissoes");
    };
}
