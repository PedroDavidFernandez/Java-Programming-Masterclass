package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdasTest {
    public static void main(String[] args) {
        AnotherCar anotherCar1 = new AnotherCar("Mazda Three", 16265.12);
        AnotherCar anotherCar2 = new AnotherCar("Bmw Series 1", 33299.99);
        AnotherCar anotherCar3 = new AnotherCar("Toyota Yaris", 22057.00);
        AnotherCar anotherCar4 = new AnotherCar("Dustin", 10157.67);
        AnotherCar anotherCar5 = new AnotherCar("Austin Martin", 299999.99);
//        Car car6 = new Car("0 Model", 299999.99);
//        Car car7 = new Car("model 1", 299999.99);

        List<AnotherCar> anotherCars = new ArrayList<>();
        anotherCars.add(anotherCar1);
        anotherCars.add(anotherCar2);
        anotherCars.add(anotherCar3);
        anotherCars.add(anotherCar4);
        anotherCars.add(anotherCar5);
//        cars.add(car6);
//        cars.add(car7);

        for (AnotherCar anotherCar : anotherCars) {
            System.out.println(anotherCar.getModel() + " costs " + anotherCar.getPrize() + "€");
        }

//        Collections.sort(cars, new Comparator<Car>() {
//            @Override
//            public int compare(Car car1, Car car2) {
//                return car1.getModel().compareTo(car2.getModel());
//            }
//        });

        // replace with Lambda expression
        Collections.sort(anotherCars, (cars1, cars2) -> cars1.getModel().compareTo(cars2.getModel()));

        System.out.println("***");
        for (AnotherCar anotherCar : anotherCars) {
            System.out.println(anotherCar.getModel() + " costs " + anotherCar.getPrize() + "€");
        }
    }
}

class Car {
    private String model;
    private double prize;

    public Car() {
    }

    public Car(String model, double prize) {
        this.model = model;
        this.prize = prize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
}
