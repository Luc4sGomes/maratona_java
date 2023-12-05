package org.example.maratonajava.javacore.ZZKJunit.domain;

public class Developer extends Employee {
    private String id;
    private String mainLanguage;

    public Developer(String id, String mainLanguage) {
        this.id = id;
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String getId() {
        return id;
    }
}
