package com.lbg;

import com.lbg.classes.Car;
import com.lbg.classes.CarColour;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!\n");

        // creating a new object of car called bartCar
        Car bartCar = new Car();

        // using the getter method to print out the speed
        System.out.println(bartCar.getSpeed());

        // prints out the memory address of bartCar
        System.out.println(bartCar);

        bartCar.setColour(CarColour.YELLOW);
        bartCar.setModel("scooter");
        System.out.println(bartCar.getSpeed());
        System.out.println(bartCar.getColour());
        System.out.println(bartCar.getModel());
        bartCar.accelerate(30);
        System.out.println(bartCar.getSpeed());
        bartCar.accelerate(60);
        System.out.println(bartCar.getSpeed());
        bartCar.decelerate(30);
        System.out.println(bartCar.getSpeed());

        Car lisaCar = new Car("BMW");
        lisaCar.accelerate(40);
        System.out.println(lisaCar.getSpeed());
        lisaCar.accelerate(50);
        System.out.println(lisaCar.getSpeed());

        Car[] cars = new Car[3];
        cars[0] = bartCar;
        cars[1] = lisaCar;
        cars[2] = new Car();

        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.getColour());
            System.out.println(car.getModel());
        }
    }


}

