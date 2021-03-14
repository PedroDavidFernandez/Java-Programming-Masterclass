package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Pedro", 43.44);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.12);
        System.out.println("Balance for customer " + customer.getName() + " is " +
                + customer.getBalance());

        ArrayList<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(1);
        intArrayList.add(3);
        intArrayList.add(5);

        for (Integer integers : intArrayList) {
            System.out.println(integers);
        }

        intArrayList.add(1, 2);
        System.out.println("***");

        for (Integer integers : intArrayList) {
            System.out.println(integers);
        }
    }
}
