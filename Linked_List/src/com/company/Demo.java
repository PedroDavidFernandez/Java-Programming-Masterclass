package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Barcelona");
        placesToVisit.add("Girona");
        placesToVisit.add("Cerdanyola");
        placesToVisit.add("Lleida");
        placesToVisit.add("Cornellà");
        placesToVisit.add("Badalona");

        printList(placesToVisit);

        placesToVisit.add(1, "Andorra la Vella");
        System.out.println("*******************************");
        printList(placesToVisit);

        placesToVisit.remove(4);

        System.out.println("*******************************");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator<String> i = placesToVisit.listIterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
            System.out.println("========================");
        }
    }
}
