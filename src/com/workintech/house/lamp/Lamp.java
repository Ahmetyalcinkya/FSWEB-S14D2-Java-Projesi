package com.workintech.house.lamp;

public class Lamp {

    private boolean battery;
    private int globRating;
    private LampType style;

    public Lamp(boolean battery, int globRating, LampType style) {
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public LampType getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", globRating=" + globRating +
                ", style=" + style +
                '}';
    }
}
