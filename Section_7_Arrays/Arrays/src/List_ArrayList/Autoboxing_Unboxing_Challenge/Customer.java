package Autoboxing_Unboxing_Challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction = new ArrayList<>();

    public Customer(String name) {
        this(name, 0.0);
    }

    public Customer(String name, Double transaction) {
        this.name = name;
        addTransaction(transaction);
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return this.transaction;
    }

    public void addTransaction(Double amount) {
        this.transaction.add(amount);
    }

    public static Customer createCustomer(String name) {
        return new Customer(name);
    }
    public static Customer createCustomer(String name, Double transaction) {
        return new Customer(name, transaction);
    }
}
