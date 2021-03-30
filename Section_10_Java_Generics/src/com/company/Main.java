package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        
        printDoubled(items);
    }

    private static void printDoubled(ArrayList items) {
        // note we used Object here because we did not specify what type of object ArrayList was
        // it was also needed to cast to Integer in the for loop
        for (Object n : items) {
            System.out.println((Integer) n * 2);
        }
    }
}
