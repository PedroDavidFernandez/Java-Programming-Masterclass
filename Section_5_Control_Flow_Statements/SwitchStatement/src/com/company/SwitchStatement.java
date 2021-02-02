package com.company;

public class SwitchStatement {

    public static void main(String[] args) {
	    int number = 3;
	    if (number == 1) {
            System.out.println("This is number 1");
        } else if (number == 2) {
            System.out.println("This is number 2");
        } else {
            System.out.println("This is neither number 1 or 2");
        }

	    int switchValue = 3;
	    switch (switchValue) {
            case 1:
                System.out.println("This is number 1");
                break;
            case 2:
                System.out.println("This is number 2");
                break;
            case 3: case  4: case 5:
                System.out.println("This is number is 3, 4, or 5");
                break;
            default:
                System.out.println("This is neither number 1, 2, 3, 4, or 5");
                break;
        }

        // create a new switch using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char character = 'Z';
	    switch (character) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value provided was either A, B, C, D or E");
                break;
            default:
                System.out.println("No character A, B, C, D or E was provided!");
                break;
        }

        String month = "January";
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Month is January");
                break;
            case "february":
                System.out.println("Month is February");
                break;
            case "march":
                System.out.println("Month is March");
                break;
            default:
                System.out.println("Month provided is neither January nor February");
        }
    }
}
