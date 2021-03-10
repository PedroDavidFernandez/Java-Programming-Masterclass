package Autoboxing_Unboxing_Challenge_Loop;

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank("EVO");

        myBank.addBranch("EVO Catalonia");
        myBank.addCustomer("EVO Catalonia", "Pedro", 55.590);
        myBank.addCustomer("EVO Catalonia", "Helena", 98.001);
        myBank.addCustomer("EVO Catalonia", "Marta", 147.10);
        myBank.addCustomer("EVO Catalonia", "Paula", 50.50);

        myBank.addBranch("EVO Iberica");
        myBank.addCustomer("EVO Iberica", "Pepe", 100);

        myBank.addBranch("EVO Digital");
        myBank.addCustomer("EVO Digital", "Ibai LLanos", 999.999);
        myBank.addCustomer("EVO Digital", "Vegeta", 500.000);

        //myBank.printCustomerList("EVO Catalonia", false);
        myBank.printCustomerList("EVO Catalonia", true);
    }
}
