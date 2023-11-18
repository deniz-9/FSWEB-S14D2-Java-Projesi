package com.workintech.model;

import com.workintech.model.enums.LampType;

public class Lamp {
    private boolean batteryPowered;
    private int globRating;
    private LampType style;

    public Lamp(boolean batteryPowered, int globRating, LampType style) {
        this.batteryPowered = batteryPowered;
        this.globRating = globRating;
        this.style = style;
    }

    public void turnOn() {
        System.out.println("Lamp is turned on.");
    }

    public boolean isBatteryPowered() {
        return batteryPowered;
    }

    public int getGlobRating() {
        return globRating;
    }

    public LampType getStyle() {
        return style;
    }
}
