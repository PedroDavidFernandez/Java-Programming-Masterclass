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

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contact in your agenda");
        for(int i=0; i<contacts.size(); i++) {
            System.out.println("Contact No # " + (i+1) +
                    ". Name: " + contacts.get(i).getName() +
                    ". Phone number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public void printContact(int index) {
        System.out.println("Name is: " + contacts.get(index).getName());
        System.out.println("Phone number is: " + contacts.get(index).getPhoneNumber());
    }

    public void addContact(String name, int phoneNumber) {
        if (contactExists(name)) return;

        contacts.add(Contacts.create(name, phoneNumber));
    }

    public void updateContact(int index, String name, int phoneNumber) {
        if (contactExists(name)) return;

        contacts.set(index, new Contacts(name, phoneNumber));
    }

    private boolean contactExists(String name) {
        if (findContact(name) >= 0) {
            System.out.println("Contact already exists!");
            return true;
        }
        return false;
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

    private int findContact(String name) {
        for (int i=0; i<contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    private static Contacts create(String name, int phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
