package Autoboxing_Unboxing_Challenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String name) {
        int position = findPosition(name);
        if (position >= 0) {
            System.out.println("Customer already exists!");
            return;
        }
        this.customers.add(Customer.createCustomer(name));
    }

    public void addCustomer(String name, Double transaction) {
        int position = findPosition(name);
        if (position < 0) {
            this.customers.add(Customer.createCustomer(name, transaction));
            return;
        }
        this.customers.get(position).addTransaction(transaction);
    }

    private int findPosition(String name) {
        for (int i=0; i<customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
            System.out.println("Customer List");
            System.out.println(i + ". Customer Name is -> " + customers.get(i).getName() +
                    ". Customer Transaction -> " + customers.get(i).getTransaction());
            return i;
            }
        }
        return -1;
    }

    public static Branch createBranch(ArrayList<Customer> customer) {
        return new Branch(customer);
    }
}
