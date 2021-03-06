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
}
