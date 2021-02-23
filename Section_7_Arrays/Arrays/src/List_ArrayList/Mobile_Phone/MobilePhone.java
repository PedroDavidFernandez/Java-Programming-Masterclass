package List_ArrayList.Mobile_Phone;

import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }

    }


    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts items.");
        System.out.println("\t 2 - To add an contact to the list.");
        System.out.println("\t 3 - To quit the application.");
    }

    private static void printContacts() {
        contacts.printContacts();
    }

    private static void addContact() {
        System.out.print("Please enter name of the new contact: ");
        String name = scanner.nextLine();
        System.out.print("Please enter phone number of the new contact: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();

        contacts.addContact(name, phoneNumber);
    }
}
