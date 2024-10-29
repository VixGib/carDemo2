package com.lbg.classes;

// car is "a kind of vehicle" - now has wheels based on vehicle abstract class
// final means that you can't have a class that inherits from this class there can be no sub-class
public final class Car extends Vehicle implements ISteerable{
    // constructors

    public Car(String model, String make){
        // chaining constructors from base class
        super(4, "Car Unregistered");
        this.setModel(model);
        this.setMake(make);
    }

    // parameterless constructor
    public Car(){
        this("UnKnown", "UnKnown");
//        this.make = "Unknown";
//        this.setModel("Unknown");

    }


// constructor with parameters
    public Car(String carName) {
        this.carName = carName;

    }

    public Car(String make, String model, int topSpeed){
        this(model, make);
//        this.make = make;
//        this.model = model;
        this.topSpeed = topSpeed;
    }

    public Car(String registration, int numOfDoors){
        this("UnKnown", "UnKnown");
        this.registration = registration;
        this.numOfDoors = numOfDoors;
    }


    //
    @Override
    public String performService() {
        String base = super.performService();
        base +=  "....I am a car!";
        return base;
    }

    // annotation
    @Override
    public String toString() {
        String info = "Car: " + this.getMake();
        info += "\nModel: " +this.getModel();
        info += "\nNumber of Doors: " +this.getNumOfDoors();
        info += "\nTop Speed: " +this.getTopSpeed();
        info += "\nRegistration Number: " +this.getRegistration();




        return info;
        //return super.toString();
    }

    // setting private variable speed
    private int speed;

    private String make;

    private CarColour colour;

    private String model;

    private int numOfDoors;

    private String registration;

    private int topSpeed;

    private String carName;

    private static int numOfWheels = 4;





    public static int getNumOfWheels() {
        return numOfWheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }





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

    @Override
    public String turnLeft() {
        return "Car is turning left";
    }

    @Override
    public String turnRight() {
        return "Car is turning right";
    }
}
