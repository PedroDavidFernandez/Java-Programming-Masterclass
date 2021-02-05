package this_vs_super;

class SuperClass {
    public void printMethod() {
        System.out.println("Printed in Superclass");
    }
}

class SubClass extends SuperClass {
    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
}

class MainClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}