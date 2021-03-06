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


        for (int i=0; i<myCustomerArrayList.size(); i++) {
            System.out.println(i + ". Customer Name is -> " + myCustomerArrayList.get(i). getName() +
                    ". Customer Transaction -> " + myCustomerArrayList.get(i).getTransaction());
        }
    }
}
