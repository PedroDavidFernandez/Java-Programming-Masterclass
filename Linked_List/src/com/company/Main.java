package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Pedro", 43.44);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.12);
        System.out.println("Balance for customer " + customer.getName() + " is " +
                + customer.getBalance());
    }
}
