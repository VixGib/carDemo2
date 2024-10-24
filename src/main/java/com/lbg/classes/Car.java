package com.lbg.classes;

public class Car {
    // constructors
    public Car(String model){
        this.setModel(model);
    }

    public Car(){
        this.make = "Unknown";
        this.setModel("Unknown");
    }




    // setting private variable speed
    private int speed;

    private String make;

    private CarColour colour;

    private String model;




    // creating public getter method to return the speed
    public int getSpeed() {
        return this.speed;
    }

    //creating public getter method to return car make
    public String getMake() {
        return this.make;

    }

    private String model(){
        return model;
    }

    public CarColour getColour() {
        return this.colour;
    }

    public void setColour(CarColour newColour){
        this.colour = newColour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate (int deltaV) {
        if (deltaV > 0) {
            this.speed += deltaV;
        }
    }

    public void decelerate (int deltaV) {
        if (deltaV > 0) {
            this.speed -= deltaV;
        }
    }

}
