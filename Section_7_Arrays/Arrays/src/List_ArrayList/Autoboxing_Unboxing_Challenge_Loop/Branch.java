package Autoboxing_Unboxing_Challenge_Loop;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double initialAmount) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount) {
        Customer checkedCustomer = findCustomer(name);
        if (checkedCustomer != null) {
            System.out.println("Customer does not exist! Please create customer first!");
            return false;
        }
        checkedCustomer.addTransaction(amount);
        return true;
    }

    public Customer findCustomer(String name) {
        for (int i=0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
