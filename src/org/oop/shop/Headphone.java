package org.oop.shop;

public class Headphone extends Product {
    private String color;
    private boolean isWireless;

    public Headphone(String name, String description, double price, int vat, String color, boolean isWireless) {
        super(name, description, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + ", Headphone{" +
                "color='" + color + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
