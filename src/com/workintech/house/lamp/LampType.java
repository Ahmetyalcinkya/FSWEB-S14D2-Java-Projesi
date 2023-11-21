package com.workintech.house.lamp;

public enum LampType {

    ARCHED(200,"white"),
    CLUB(300, "sunshine"),
    TORCHIERE(500, "yellow");

    private int watt;
    private String color;

    LampType(int watt, String color) {
        this.watt = watt;
        this.color = color;
    }

    public int getWatt() {
        return watt;
    }

    public String getColor() {
        return color;
    }
}
