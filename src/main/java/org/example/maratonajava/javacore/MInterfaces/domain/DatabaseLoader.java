package org.example.maratonajava.javacore.MInterfaces.domain;

public class DatabaseLoader implements  DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("carrega dados do nosso banco de dados");
    }


    @Override
    public void remove() {

    }
}
