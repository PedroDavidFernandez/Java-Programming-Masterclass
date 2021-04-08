package com.company.account;

public class Main {
    public static void main(String[] args) {
        Account pedroAccount = new Account("Pedro");
        pedroAccount.deposit(1000);
        pedroAccount.withdraw(500);
        pedroAccount.deposit(-20);
        pedroAccount.withdraw(-10);
        pedroAccount.deposit(300);

        // pedroAccount.balance = 8000;
        // pedroAccount.transactions.add(60000);

        pedroAccount.calculateBalance();
    }
}
