package List_ArrayList.Mobile_Phone;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private int phoneNumber;
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public Contacts(){
    }

    public Contacts(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void addContact(String name, int phoneNumber) {
        contacts.add(Contacts.create(name, phoneNumber));
    }

    public void removeContact(int phoneNumber) {
        int position = findContact(phoneNumber);

        if (position >= 0) {
            contacts.remove(position);
        } else {
            System.out.println("This number is currently not in your agenda!");
        }
    }

    public int find(int phoneNumber) {
        return findContact(phoneNumber);
    }

    private int findContact(int phoneNumber) {
        for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber() == phoneNumber) {
                return i;
            }
        }

        return -1;
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contact in your agenda");
        for(int i=0; i<contacts.size(); i++) {
            System.out.println("Contact No # " + (i+1) +
                    ". Name: " + contacts.get(i).getName());
            System.out.println("Contact No # " + (i+1) +
                    ". Phone number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public void printContact(int index) {
        System.out.println("Name is: " + contacts.get(index).getName());
        System.out.println("Phone number is: " + contacts.get(index).getPhoneNumber());
    }

    private static Contacts create(String name, int phoneNumber) {
        return new Contacts(name, phoneNumber);
    }

    public void updateContact(int index, String name, int phoneNumber) {
        contacts.set(index, new Contacts(name, phoneNumber));
    }
}
