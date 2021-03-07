package Autoboxing_Unboxing_Challenge_version2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 75.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sidney");
        bank.addCustomer("Sidney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", false);
        bank.listCustomers("Adelaide", true);
    }
}
