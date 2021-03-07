package Autoboxing_Unboxing_Challenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(ArrayList<Customer> customer) {
        this.branches.add(Branch.createBranch(customer));
        return true;
    }

    public void showListOfCustomers(boolean transaction) {
        for (int i=0; i< branches.size(); i++) {
            for (int j=0; j<branches.get(i).getCustomers().size(); j++) {
                System.out.print("Client name: " + branches.get(i).getCustomers().get(j).getName());
                if (transaction) {
                    System.out.println("\tTransaction: " + branches.get(i).getCustomers().get(j).getTransaction());
                }
            }
        }
    }
}
