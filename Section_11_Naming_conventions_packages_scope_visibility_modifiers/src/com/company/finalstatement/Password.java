package com.company.finalstatement;

public class Password {
    private static final int key = 12061977;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = decryptEncrypt(password);
    }

    private int decryptEncrypt(int password) {
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Storing password is " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (this.encryptedPassword != decryptEncrypt(password)) {
            System.out.println("No no no");
            return false;
        }
        System.out.println("Welcome!");
        return true;
    }
}
