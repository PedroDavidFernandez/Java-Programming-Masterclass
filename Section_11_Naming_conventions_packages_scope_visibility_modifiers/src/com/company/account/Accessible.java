package com.company.account;

// interface is accessible to all classes within the package
public interface Accessible {
    // public static variable
    int SOME_CONSTANT = 100;

    // standard public
    public void methodA();

    // all interfaces methos are public (still is an interface)
    void methodB();
    boolean methidC();

    // all static public methods are expected in an interface
}
