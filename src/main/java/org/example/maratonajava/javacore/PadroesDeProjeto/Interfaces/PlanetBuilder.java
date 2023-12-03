package org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces;

import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Planet;

public interface PlanetBuilder {
    PlanetBuilder setName(String name);

    PlanetBuilder setHabitat(String habitat);

    PlanetBuilder setSize(double Size);

    Planet build();

}
