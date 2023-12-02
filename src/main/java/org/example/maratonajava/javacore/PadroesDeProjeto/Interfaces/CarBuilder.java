package org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces;

import org.example.maratonajava.javacore.PadroesDeProjeto.domain.Car;

public interface CarBuilder {
    CarBuilder setModel(String model);

    CarBuilder setMotor(String motor);

    CarBuilder setYearOfManufacture(int yearOfManufacture);

    Car build();
}
