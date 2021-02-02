package com.company;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is my string";
        System.out.println("my string is equal to: " + myString);
        myString = myString + " and this is more.";
        System.out.println("My string is equal to: " + myString);

        String numberString = "150";
        numberString = "150" + numberString;
        System.out.println(numberString);

        String myLastString = "200";
        int number = 50;
        myLastString = number + myLastString;
        System.out.println(myLastString);

        double doubleNumber = 25.50d;
        myLastString = doubleNumber + myLastString;
        System.out.println(myLastString);

        // Strings in Java are Immutable! It cant be changed after is created, instead a new string is created
        // Code above to append is inefficient - something called StringBuffer is more efficient
    }
}
