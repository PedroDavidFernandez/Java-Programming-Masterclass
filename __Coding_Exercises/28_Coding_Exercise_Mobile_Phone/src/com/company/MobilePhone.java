package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList();
    }

    public boolean addNewContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private Contact findContact(String name) {
        for (int i=0; i<myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printUsers() {
        System.out.println("Contact List");
        if (this.myContacts.size() == 0) {
            System.out.println("There are no contacts currently in your agenda!");
            return;
        }

        for (int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " +
                    myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int positionOldContact = findContact(oldContact);
        if (positionOldContact < 0) {
            System.out.println("Existing contact not found in your agenda");
            return false;
        } else if (findContact(oldContact.getName()) == null){
            System.out.println("Existing contact not found in your agenda");
            return false;
        }

        this.myContacts.set(positionOldContact, newContact);
        return true;
    }

    public Contact queryContact(String oldName) {
        if (findContact(oldName) == null) {
            return null;
        }

        return findContact(oldName);
    }
}

