package com.company;

public class Main {

    public static void main(String[] args) {
	    String varFour = "This is private to main()";

	    ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("Scope Instance private var is " + scopeInstance.getVarOne());
        System.out.println(varFour);
        scopeInstance.timesTwo();
        scopeInstance.useInner();

        // Create inner class
        System.out.println("******");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        // ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        // System.out.println("var 3 is not available here " + innerClass.varThree);
    }
}
