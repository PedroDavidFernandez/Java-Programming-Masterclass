package com.company;

public class Main {

    public static void main(String[] args) {
	    String varFour = "This is private to main()";

	    ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope Instance private var is " + scopeInstance.getVarOne());
        System.out.println(varFour);
        scopeInstance.timesTwo();

        // Create inner class
        System.out.println("******");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
