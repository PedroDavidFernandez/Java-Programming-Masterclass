package com.company;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Float minimum value = " + myMinFloatValue);
    System.out.println("Float maximum value = " + myMaxFloatValue);

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("Double minimum value = " + myMinDoubleValue);
    System.out.println("Double maximum value = " + myMaxDoubleValue);

    int myIntValue = 5 / 3;
    float myFloatValue = 5 / 3f;
    double myDoubleValue = 5.00 / 3.00;
    System.out.println("MyIntValue = " + myIntValue);
    System.out.println("MyFloatValue = " + myFloatValue);
    System.out.println("MyDoubleValue = " + myDoubleValue);

    // convert a given number of pounds to kilograms

    double myPoundValue = 12d;
    double result = myPoundValue * 0.45359237d;
    System.out.println("Converted kilograms = " + result);

    double pi = 3.1415927d;
    double anotherNumber = 3_000_000.4_457_890d;
    System.out.println(pi);
    System.out.println(anotherNumber);
    }
}
