package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination!");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                System.out.println(newCity + " has been successfully added!");
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}
