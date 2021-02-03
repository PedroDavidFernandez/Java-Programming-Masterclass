package com.company.BankAccount;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        /*BankAccount account = new BankAccount(
                "ES66-000333-XXYY-Z09",
                12000,
                "PedroFernandez",
                "test@email.com",
                610000000
        );*/

        System.out.println("*** Another Account ***");
        BankAccount anotherAccount = new BankAccount( "test", "email", 12);
        System.out.println(anotherAccount.getAccountNumber());
        System.out.println(anotherAccount.getBalance());
        System.out.println(anotherAccount.getEmail());
        System.out.println(anotherAccount.getCustomerName());
        System.out.println(anotherAccount.getPhoneNumber());

        System.out.println("*** Account ***");
        System.out.println("Customer name is: " + account.getCustomerName());
        System.out.println("Email is: " + account.getEmail());
        System.out.println("Phone number is: +34 " + account.getPhoneNumber());
        System.out.println("balance is: " + account.getBalance());
        account.deposit(8000);
        System.out.println("balance is: " + account.getBalance());
        account.withdrawal(5000.55);
        System.out.println("balance is: " + account.getBalance());
        account.withdrawal(17000);
        System.out.println("balance is: " + account.getBalance());
    }
}
