package com.company.BankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("The withdrawal amount is higher than the current balance!");
            return;
        }
        this.balance -= amount;
    }
}
