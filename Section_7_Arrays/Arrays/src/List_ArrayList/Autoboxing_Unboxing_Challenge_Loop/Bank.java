package Autoboxing_Unboxing_Challenge_Loop;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            System.out.println("Unable to find Branch with given name!");
            return false;
        }

        Customer existingCustomer = existingBranch.findCustomer(customerName);
        if (existingCustomer == null) {
            existingBranch.addCustomer(customerName, initialAmount);
            return true;
        }

        System.out.println("Customer already exists!");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            System.out.println("Unable to find Branch with given name!");
            return false;
        }

        Customer existingCustomer = existingBranch.findCustomer(customerName);
        if (existingCustomer != null) {
            existingBranch.addCustomerTransaction(customerName, amount);
            return true;
        }

        System.out.println("Customer does not exists!");
        return false;
    }

    public boolean printCustomerList(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customer details for " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i=0; i<branchCustomers.size(); i++ ) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i+1) + ". Customer Name: " + branchCustomer.getName());
                if (printTransaction) {
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j=0; j<transactions.size(); j++) {
                        System.out.println((j+1) + ". Transactions Amount: " + transactions.get(j));
                    }
                }

            }
            return true;
        }

        System.out.println("Branch with given name does not exist!");
        return false;
    }

    private Branch findBranch(String name) {
        for (int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(name)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
