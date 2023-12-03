package org.example.maratonajava.javacore.PadroesDeProjeto.domain;

public class Planet {
    private String name;
    private String habitat;
    private double size;


    public Planet(String name, String habitat, double size) {
        this.name = name;
        this.habitat = habitat;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
