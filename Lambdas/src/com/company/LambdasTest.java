package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdasTest {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda Three", 16265.12);
        Car car2 = new Car("Bmw Series 1", 33299.99);
        Car car3 = new Car("Toyota Yaris", 22057.00);
        Car car4 = new Car("Dustin", 10157.67);
        Car car5 = new Car("Austin Martin", 299999.99);
//        Car car6 = new Car("0 Model", 299999.99);
//        Car car7 = new Car("model 1", 299999.99);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
//        cars.add(car6);
//        cars.add(car7);

        for (Car car: cars) {
            System.out.println(car.getModel() + " costs " + car.getPrize() + "€");
        }

//        Collections.sort(cars, new Comparator<Car>() {
//            @Override
//            public int compare(Car car1, Car car2) {
//                return car1.getModel().compareTo(car2.getModel());
//            }
//        });

        // replace with Lambda expression
        Collections.sort(cars, (cars1, cars2) -> cars1.getModel().compareTo(cars2.getModel()));

        System.out.println("***");
        for (Car car: cars) {
            System.out.println(car.getModel() + " costs " + car.getPrize() + "€");
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
