package org.example.maratonajava.javacore.PadroesDeProjeto.domain;

import org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces.PlanetBuilder;

public class DirectorPlanet {
    PlanetBuilder planetBuilder;

    public DirectorPlanet(PlanetBuilder planetBuilder) {
        this.planetBuilder = planetBuilder;
    }

    public Planet buildPlanetAqua() {
        return planetBuilder.setName("xf10960")
                .setHabitat("aqua")
                .setSize(1223049)
                .build();
    }

    public Planet buildPlanetEarth() {
        return planetBuilder.setName("Earth13224xaq")
                .setHabitat("Earth")
                .setSize(121332)
                .build();
    }

}
