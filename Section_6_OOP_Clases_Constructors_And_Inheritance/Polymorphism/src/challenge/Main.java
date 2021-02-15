package challenge;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car -> Engine started");
    }

    public void accelerate() {
        System.out.println("Car -> Accelerates");
    }

    public void brake() {
        System.out.println("Car -> Brakes");
    }
}

class Mazda3 extends Car {
    public Mazda3() {
        super("Mazda3", 6);
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Engine started");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() +  " -> Accelerates");
    }

    public void brake() {
        super.brake();
        System.out.println(getClass().getSimpleName() + " -> Brakes");
    }
}

class BMW5 extends Car {
    public BMW5() {
        super("BMW 5", 14);
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Engine started");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " -> Accelerates");
    }

    public void brake() {
        super.brake();
        System.out.println(getClass().getSimpleName() + " -> Brakes");
    }
}

class MercedesSport extends Car {
    public MercedesSport() {
        super("Mercedes Sport", 26);
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Engine started");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " -> Accelerates");
    }

    public void brake() {
        super.brake();
        System.out.println(getClass().getSimpleName() + " -> Brakes");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            Car car = randomCar();
            System.out.println("Car name is " + car.getName() + " and number of cilinders is: " + car.getCylinders());
            car.accelerate();
        }
    }

    public static Car randomCar() {
        int random = (int) ((Math.random() * 3) + 1);

        switch (random) {
            case 1:
                return new Mazda3();
            case 2:
                return new BMW5();
            case 3:
                return new MercedesSport();
        }
        return null;
    }
}
