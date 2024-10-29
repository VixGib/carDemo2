package com.lbg.classes;
// this is an idea you can't instanciate it use as basis for other more specific classes
public class Vehicle {

    // constructor
    public Vehicle(){
        this.setNumberOfWheels(4);
        this.setRegistrationNum2("Unregistered");
    }

    // overloaded constructor adding parameters
    public Vehicle(int numWheels, String regNumber){
        this.setNumberOfWheels(numWheels);
        this.setRegistrationNum2(regNumber);
    }

    // method use a doing word
    public  String performService(){
        return this.getRegistrationNum2() + ": Vehicle is being serviced";
    }

    // overriding constructor changing or overriding the output in a string
    @Override
    public String toString() {
        return "Vehicle " + this.getNumberOfWheels() + " " + this.getRegistrationNum2();
        //return super.toString(); - (uses java.lang.object default toString the base class)
    }

    // getters and setters - methods to get and set information from private vehicles
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {

        this.numberOfWheels = numberOfWheels;
    }

    public String getRegistrationNum2() {
        return registrationNum2;
    }

    public void setRegistrationNum2(String registrationNum2) {
        this.registrationNum2 = registrationNum2;
    }



    // class variables
    private int numberOfWheels;

    private String registrationNum2;

    // this variable is visible in this class and any derived classes
    protected String engineInfo;
}
