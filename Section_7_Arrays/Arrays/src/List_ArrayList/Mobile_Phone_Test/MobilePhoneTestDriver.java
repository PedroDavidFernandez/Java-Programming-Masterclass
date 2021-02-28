package List_ArrayList.Mobile_Phone_Test;

import java.util.Scanner;

public class MobilePhoneTestDriver {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("610181183");

    public static void main(String[] args) {
        boolean quit = false;
        startingMobilePhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    shuttingMobilePhone();
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter the name of the contact you want to search:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (mobilePhone.queryContact(name) == null) {
            System.out.println("Contact not found");
        }

        mobilePhone.queryContact(contact);
    }

    private static void addNewContact() {
        System.out.println("Please enter contact name");
        String name = scanner.nextLine();
        System.out.println("Please enter contact phone number");
        String number = scanner.nextLine();

        if (mobilePhone.addContact(name, number)) {
            System.out.println("New contact added: name = " + name + ", phone = " + number);
        } else {
            System.out.println("Contact already exists!");
        }
    }

    private static void updateContact() {
        System.out.println("Please enter the name of the contact you want to update");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);
        if (mobilePhone.queryContact(oldName) == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Please enter the  new name:");
        String newName = scanner.nextLine();
        System.out.println("Please enter the new number:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.create(newName, newNumber);


        mobilePhone.updateContact(oldContact, newContact);
    }

    private static void removeContact() {
        System.out.println("Please enter the name of the contact you want to remove");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (mobilePhone.queryContact(name) == null) {
            System.out.println("Contact not found");
            return;
        }

        mobilePhone.removeContact(contact);
    }

    private static void startingMobilePhone() {
        System.out.println("Starting down Mobile Phone...");
    }

    private static void shuttingMobilePhone() {
        System.out.println("Shutting down Mobile Phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing an existing contact\n" +
                "4 - to remove existing an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - print a list of available actions.");
        System.out.println("Choose your actions: ");
    }
}
