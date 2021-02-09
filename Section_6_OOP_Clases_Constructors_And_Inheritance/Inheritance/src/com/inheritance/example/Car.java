package com.inheritance.example;

public class Car extends Vehicle {
    private int numberOfWheels;
    private int numberOfDoors;
    private int numberOfGears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int numberOfWheels, int numberOfDoors, int numberOfGears, boolean isManual) {
        super(name, size);
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.numberOfGears = numberOfGears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Cahnged to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    @Override
    public void stop() {
        super.stop();
    }
}
