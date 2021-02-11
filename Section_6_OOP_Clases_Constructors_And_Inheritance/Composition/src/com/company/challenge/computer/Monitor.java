package com.company.challenge.computer;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public void switchMonitor() {
        System.out.println("Monitor.switch()");
    }
}
