package com.company;

import java.util.Scanner;

public class Driver {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone("610 18 11 83");
    public static void main(String[] args) {

        boolean quit = false;
        startMobilePhone();
        printInstructions();
        while (!quit) {
            System.out.println("Please enter your choice. Press 6 to print options:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Shutting down mobile phone...");
                    quit = true;
                    break;
                case 1:
                    myMobilePhone.printUsers();
                    break;
                case 2:
                    createUser();
                    break;
                case 3:
                    updateUser();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    private static void updateUser() {
        System.out.println("Please enter existing user name: ");
        String oldName = scanner.nextLine();
        Contact oldContact = myMobilePhone.queryContact(oldName);
        if (oldContact == null) {
            System.out.println("Contact could not be found!");
            return;
        }

        System.out.println("Please enter new user name: ");
        String newName = scanner.nextLine();
        System.out.println("Please enter new phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if (myMobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Contact has been updated correctly");
        } else {
            System.out.println("Contact could not be updated correctly");
        };
    }

    private static void createUser() {
        System.out.println("Please enter user name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter phone number: ");
        String phoneNumber = scanner.nextLine();

        if (myMobilePhone.addNewContact(Contact.createContact(name, phoneNumber))) {
            System.out.println("Contact has been created correctly");
        }
    }

    private static void startMobilePhone() {
        System.out.println("Mobile phone starting...");
    }

    private static void printInstructions() {
        System.out.print("\n Please choose any of the following options" +
                "\n 0. Shutdown Mobile Phone" +
                "\n 1. Print list of contacts" +
                "\n 2. Create a new contact" +
                "\n 3. Update an existing contact" +
                "\n 4. Remove an existing contact" +
                "\n 5. Query for a contact"
                );
    }
}
