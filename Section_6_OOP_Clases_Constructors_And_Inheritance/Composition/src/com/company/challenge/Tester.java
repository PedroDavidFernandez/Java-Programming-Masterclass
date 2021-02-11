package com.company.challenge;

import com.company.challenge.computer.Keyboard;
import com.company.challenge.computer.Monitor;
import com.company.challenge.computer.Mouse;
import com.company.challenge.computer.Resolution;

public class Tester {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(158);
        Monitor monitor = new Monitor(
                "DELL-HYPE 2000",
                "DELL",
                27,
                new Resolution(123, 312)
        );
        Mouse mouse = new Mouse();

        Room room = new Room(
                new Door(10, 15),
                new Chair(4, 1, "study chair"),
                new Computer(keyboard, monitor, mouse)
        );
        room.study();
        room.getComputer().getKeyboard().logIn();
    }
}
