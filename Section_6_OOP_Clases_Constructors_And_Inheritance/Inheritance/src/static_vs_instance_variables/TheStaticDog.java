package static_vs_instance_variables;

class TheStaticDog {
    private static String name;

    public TheStaticDog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My dog name is " + name);
    }
}

class TheInstanceVariableDog {
    private String name;

    public TheInstanceVariableDog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("My dog name is " + name);
    }
}

class Main {
    public static void main(String[] args) {
        TheStaticDog myDog = new TheStaticDog("Michu");
        TheStaticDog yourDog = new TheStaticDog("Terminator");
        myDog.printName();
        yourDog.printName();

        TheInstanceVariableDog myInstDog = new TheInstanceVariableDog("Falete");
        TheInstanceVariableDog yourInstDog = new TheInstanceVariableDog("Pelusa");
        myInstDog.printName();
        yourInstDog.printName();
    }
}
