package org.example.maratonajava.javacore.PadroesDeProjeto.domain;

import org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces.CarBuilder;

public class Director {
    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCarSporting() {
        return carBuilder.setModel("Sporting")
                .setMotor("V8")
                .setYearOfManufacture(2023)
                .build();
    }

    public Car buildCarDefault() {
        return carBuilder.setModel("Default")
                .setMotor("V4")
                .setYearOfManufacture(2023)
                .build();


    }

    public Car buildCarPopular() {
        return carBuilder.setModel("popular")
                .setMotor("V2")
                .setYearOfManufacture(1990)
                .build();
    }
}
