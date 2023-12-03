package org.example.maratonajava.javacore.PadroesDeProjeto.domain;

import org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces.PlanetBuilder;

public class PlanetBuilderImpl implements PlanetBuilder {

    private String name;
    private String habitat;
    private double size;


    @Override
    public PlanetBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PlanetBuilder setHabitat(String habitat) {
        this.habitat = habitat;
        return this;
    }

    @Override
    public PlanetBuilder setSize(double size) {
        this.size = size;
        return this;
    }

    @Override
    public Planet build() {
        return new Planet(name, habitat, size);
    }
}
