package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2021";
        System.out.println("numberAsString " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString " + numberAsString);
        System.out.println("number " + number);

        double anotherNumber = Double.parseDouble(numberAsString);
        anotherNumber += 0.25;
        System.out.println("number " + anotherNumber);
    }
}
