package com.company;

public class DogDriver {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Rover");
        Dog dog = new Dog("Rover");

        System.out.println(dog.equals(labrador));
        System.out.println(labrador.equals(dog));
    }
}
