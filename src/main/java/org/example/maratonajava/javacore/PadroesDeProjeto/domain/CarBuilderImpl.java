package org.example.maratonajava.javacore.PadroesDeProjeto.domain;


import org.example.maratonajava.javacore.PadroesDeProjeto.Interfaces.CarBuilder;

public class CarBuilderImpl implements CarBuilder {

    private String model;
    private String motor;
    private int yearOfManufacture;

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setMotor(String motor) {
        this.motor = motor;
        return this;
    }

    @Override
    public CarBuilder setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        return this;
    }

    @Override
    public Car build() {
        return new Car(model, motor, yearOfManufacture);
    }

}
