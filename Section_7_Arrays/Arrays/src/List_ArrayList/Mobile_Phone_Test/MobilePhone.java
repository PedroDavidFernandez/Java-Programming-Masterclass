package List_ArrayList.Mobile_Phone_Test;

import java.util.ArrayList;

public class MobilePhone {
    private String number;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String number) {
        this.number = number;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(String name, String number) {
        if (findContact(name) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }

        this.myContacts.add(Contact.create(name, number));
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("Contact does not exist!");
            return false;
        }

        this.myContacts.set(position, newContact);
        System.out.println("Name has been updated to " + newContact.getName() +
                " and phone number has been updated to " + newContact.getNumber());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println("Contact does not exist!");
            return false;
        }

        this.myContacts.remove(contact);
        System.out.println(contact.getName() + " was successfully deleted!");
        return true;
    }

    public String queryContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("List of contacts");
        for (int i=0; i<this.myContacts.size(); i++) {
            System.out.println(this.myContacts.get(i).getName() + " -> "
                + this.myContacts.get(i).getNumber());
        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i=0; i<this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
