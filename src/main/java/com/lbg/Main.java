package com.lbg;

import com.lbg.classes.Car;
import com.lbg.classes.CarColour;
import com.lbg.classes.Vehicle;
import com.lbg.classes.Wheel;

import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
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

        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();

        wheel1.setX_position(10);
        wheel1.setY_position(20);

        wheel2.setX_position(-10);
        wheel2.setY_position(-20);

        System.out.println(wheel1.distanceFrom(wheel2.getX_position(), wheel2.getY_position()));

        Wheel wheel3 = new Wheel(25, 50);
        System.out.println(wheel3.getX_position() + " " + wheel3.getY_position());


//        // making an array of colours using the values in the CarColour enum class
//        CarColour [] colours = CarColour.values();
//         //initialising a new random value
//        Random random = new Random();
//         //making a random number from the indexes of the array using random.nextint
//        int randomIndex = random.nextInt(colours.length);
//        // using the random index number to access a colour in the car colour array
//        CarColour randomColour = colours[randomIndex];
//        System.out.println(randomColour);

        // starting a for loop, initialising variable i at 0, then adding logic for when i is less than 100 to complete logic then add 1 so the loop runs 100 time
        for (int i = 0; i < 100; i++) {

            CarColour[] colours = CarColour.values();
            Random random = new Random();

            int randomIndex = random.nextInt(colours.length);
            CarColour randomColour = colours[randomIndex];
            // instantiating an object of the class and giving it the name carName and the instance plus 1 to get numbers 1 tp 100
            Car car = new Car("Car" + (i + 1));


            car.setColour(randomColour);
            // printing out the car name using the getCarName function we created in the car class
            System.out.println("Car Name :" + car.getCarName() + " Colour: " + car.getColour());
//
//
//
//
//            }
            Car vickiCar = new Car("Volvo", "xc90", 100);
            Car raineCar = new Car("Mercedes", "A class", 120);
            Car bobCar = new Car("Fiat", "Ibiza", 110);
            Car sueCar = new Car("Honda", "Jazz", 90);


            Car georgeCar = new Car("LX62 MJH", 5);
            Car mattCar = new Car("BP70 DRH", 3);
            Car alexCar = new Car("BI67 PLH", 5);
            Car victoriaCar = new Car("PR73 JKH", 5);

            System.out.println(victoriaCar.getRegistration());
            System.out.println(raineCar.getTopSpeed());
            System.out.println(mattCar.getNumOfDoors());
            System.out.println(vickiCar.getModel());
            System.out.println(bobCar.getNumOfDoors());

            // prints out all of the info on that object in the to string format
            System.out.println(vickiCar.toString());

            Car danCar = new Car("Ford", "Focus", 95);
            System.out.println(Car.getNumOfWheels());


            Car c1 = new Car("KA", "Ford");
            c1.setNumberOfWheels(4);
            System.out.println(c1.getNumberOfWheels());


        }


    }
}



