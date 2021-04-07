package com.company;

public class Main {

    public static void main(String[] args) {
	    String privateVar = "This is private to main()";

	    ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope Instance private var is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);
        scopeInstance.timesTwo();

        // Create inner class
        System.out.println("******");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
