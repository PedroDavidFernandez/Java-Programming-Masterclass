package challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player pedro = new Player("Pedro", 10, 25);
        System.out.println(pedro.toString());
        saveObject(pedro);

        pedro.setHitPoints(1500);
        System.out.println(pedro);
        pedro.setWeapon("Stormbringer");
        saveObject(pedro);
        loadObject(pedro);
        System.out.println(pedro);

        Saveable wolf = new Monster("Werewolf", 20, 40);
        System.out.println(wolf);
        System.out.println("*** Strength of monster is: " + ((Monster)wolf).getStrength());
        saveObject(wolf);
        loadObject(wolf);
        System.out.println(wolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave) {
        for (int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving" + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
