package com.company;

public class Main {

    public static void main(String[] args) {
        // reference vs Object vs Instance vs Class

        Animal animal = new Animal("animal", 1, 1, 5, 5);
        Animal anotherAnimal = animal;

        System.out.println(animal.getName()); // prints animal
        System.out.println(anotherAnimal.getName()); // animal

        anotherAnimal.setName("a different animal");
        System.out.println(animal.getName()); // prints a different animal
        System.out.println(anotherAnimal.getName()); // prints a different animal

        Animal strangeAnimal = new Animal("strange animal", 1, 1, 5, 5);
        anotherAnimal = strangeAnimal;

        System.out.println(animal.getName()); // prints a different animal
        System.out.println(anotherAnimal.getName()); // prints strange animal
        System.out.println(strangeAnimal.getName()); // prints strange animal
    }
}
