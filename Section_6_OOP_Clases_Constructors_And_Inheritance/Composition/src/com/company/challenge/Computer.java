package com.company.challenge;

import com.company.challenge.computer.Keyboard;
import com.company.challenge.computer.Mouse;
import com.company.challenge.computer.Monitor;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Monitor screen, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = screen;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void switchComputer() {
        this.monitor.switchMonitor();
        System.out.println("Switch.Computer()");
    }

    public void logIn() {
        this.keyboard.logIn();
    }
}
