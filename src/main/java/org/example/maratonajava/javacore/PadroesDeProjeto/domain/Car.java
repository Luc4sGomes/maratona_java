package org.example.maratonajava.javacore.PadroesDeProjeto.domain;


public class Car {
    private String model;
    private String motor;
    private int yearOfManufacture;

    public Car(String model, String motor, int yearOfManufacture) {
        this.model = model;
        this.motor = motor;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

}
