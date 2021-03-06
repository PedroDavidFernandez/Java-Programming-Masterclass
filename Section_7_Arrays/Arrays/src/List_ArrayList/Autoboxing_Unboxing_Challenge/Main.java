package Autoboxing_Unboxing_Challenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        Customer customer = new Customer("Pedro");
        Customer customer2 = new Customer( "Marta", 120.000);

        ArrayList<Customer> myCustomerArrayList = new ArrayList<Customer>();
        myCustomerArrayList.add(customer);
        myCustomerArrayList.add(customer2);

        Branch myBranch = new Branch(myCustomerArrayList);
        myBranch.addCustomer("Paula", 180.000);
        myBranch.addCustomer("Pedro", 500.000);
        myBranch.addCustomer("Pedro", 750.000);
        myBranch.addCustomer("Lupita");
        myBranch.addCustomer("Pepita");

        Branch myBranch2 = new Branch();
        myBranch2.addCustomer("Luis");
        myBranch2.addCustomer("José");
        myBranch2.addCustomer("John", 150.000);

        ArrayList<Branch> myBranches = new ArrayList<Branch>();
        myBranches.add(myBranch);
        myBranches.add(myBranch2);

        System.out.println("*** Bank ***");
        Bank myBank = new Bank(myBranches);

        for (int i=0; i<myBank.getBranches().size(); i++) {
            for (int j=0; j<myBank.getBranches().get(i).getCustomers().size(); j++) {
                System.out.println(myBank.getBranches().get(i).getCustomers().get(j).getName());
            }
        }
    }
}
