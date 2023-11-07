package org.example.maratonajava.javacore.MInterfaces.test;

import org.example.maratonajava.javacore.MInterfaces.domain.DatabaseLoader;
import org.example.maratonajava.javacore.MInterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        databaseLoader.isPermisson();
        fileLoader.load();
        fileLoader.isPermisson();
    }
}
