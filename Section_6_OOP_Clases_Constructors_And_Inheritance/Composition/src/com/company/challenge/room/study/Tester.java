package com.company.challenge.room.study;

import com.company.challenge.room.study.computer.Keyboard;
import com.company.challenge.room.study.computer.Monitor;
import com.company.challenge.room.study.computer.Mouse;
import com.company.challenge.room.study.computer.Resolution;

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

        StudyRoom room = new StudyRoom(
                new Door(10, 15),
                new Chair(4, 1, "study chair"),
                new Computer(keyboard, monitor, mouse)
        );
        room.study();
        room.getComputer().getKeyboard().logIn();
    }
}
