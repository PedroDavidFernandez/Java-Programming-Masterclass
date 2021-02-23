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


    private int findByName(String name) {
        return contacts.indexOf(name);
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

    private static Contacts create(String name, int phoneNumber) {
        return new Contacts(name, phoneNumber);
    }
}
