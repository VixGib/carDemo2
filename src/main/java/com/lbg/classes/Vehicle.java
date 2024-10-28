package com.lbg.classes;

// this is an idea you can't instanciate it
public abstract class Vehicle {
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    private int numberOfWheels;
}
