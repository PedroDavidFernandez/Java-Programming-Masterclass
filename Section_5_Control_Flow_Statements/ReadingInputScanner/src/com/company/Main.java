package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasInt = scanner.hasNextInt();

        if(hasInt) {
            int yearOfBirth = scanner.nextInt();
            int age = 2021 - yearOfBirth;
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age);
            } else {
                System.out.println("Please enter a valid year of birth!");
            }
        } else {
            System.out.println("Please write a valid age!");
        }
        scanner.close();
    }
}
