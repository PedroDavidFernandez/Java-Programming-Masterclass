package com.company.adventure;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Driver {
    private static final Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of the computer learning Java"));
        locations.put(1, new Location(1, "You are sitting at the end of a road before a small bridge"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("WEST", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("EAST", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("SOUTH", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("NORTH", 5);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("WEST", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("NORTH", 1);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("WEST", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("SOUTH", 1);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("WEST", 2);

        System.out.println(locations.get(1).getExits());

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc==0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: ");
            for (String exit: exits.keySet()) {
                if (exit.equals("W") || exit.equals("E") || exit.equals("N") || exit.equals("S")) {
                    System.out.print(exit + ", ");
                }
            }
            System.out.println();

            String directions = scanner.nextLine().toUpperCase(Locale.ROOT);
            String[] splitDirection = directions.split(" ");
            for (String direction : splitDirection) {
                if (exits.containsKey(direction)) {
                    loc = exits.get(direction);
                }
            }
        }
    }
}
