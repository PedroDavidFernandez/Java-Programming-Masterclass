package com.inheritance.example;

public class Driver {
    public static void main(String[] args) {
        Mazda mazda = new Mazda(156);

        mazda.steer(45);
        mazda.accelerate(30);
        mazda.accelerate(20);

        mazda.accelerate(-50);
    }
}
