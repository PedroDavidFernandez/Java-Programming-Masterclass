package com.company;

import java.util.ArrayList;
import java.util.List;

public class LambdasTest3 {
    public static void main(String[] args) {
        AnotherCar anotherCar1 = new AnotherCar("Mazda Three", 16265.12);
        AnotherCar anotherCar2 = new AnotherCar("Bmw Series 1", 33299.99);
        AnotherCar anotherCar3 = new AnotherCar("Toyota Yaris", 22057.00);
        AnotherCar anotherCar4 = new AnotherCar("Dustin", 10157.67);
        AnotherCar anotherCar5 = new AnotherCar("Austin Martin", 299999.99);

        List<AnotherCar> anotherCars = new ArrayList<>();
        anotherCars.add(anotherCar1);
        anotherCars.add(anotherCar2);
        anotherCars.add(anotherCar3);
        anotherCars.add(anotherCar4);
        anotherCars.add(anotherCar5);

//        String sillyString = doStringStuff(new ConcatUpper() {
//            @Override
//            public String concatAndUpper(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, anotherCars.get(0).getModel(), anotherCars.get(1).getModel());
//        System.out.println(sillyString);

        ConcatUpper uc = (s1, s2) -> {
            String result = s1.toUpperCase() + " " + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc, anotherCars.get(0).getModel(), anotherCars.get(1).getModel());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String anotherClassResult = anotherClass.doSomething();
        System.out.println(anotherClassResult);
    }

    public final static String doStringStuff(ConcatUpper uc, String s1, String s2){
        return uc.concatAndUpper(s1, s2);
    }
}

interface ConcatUpper{
    public String concatAndUpper(String s1, String s2);
}

class AnotherCar {
    private String model;
    private double prize;

    public AnotherCar() {
    }

    public AnotherCar(String model, double prize) {
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

// first test class name of a "classic" implementation
// second test class name by using a Lambda expression

class AnotherClass{
    public String doSomething(){
        int i = 75;
        ConcatUpper cu = (s1, s2) -> {
            System.out.println("i in the Lambda expression: " + i);
            System.out.println("The Lambda expression class is: " + getClass().getSimpleName());
            return s1.toUpperCase() + s2.toUpperCase();
        };
        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return LambdasTest3.doStringStuff(cu, "John", "Doe");
    }
}