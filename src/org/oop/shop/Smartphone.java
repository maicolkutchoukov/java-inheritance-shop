package org.oop.shop;

public class Smartphone extends Product {
    private String imei;
    private int memory;

    public Smartphone(String name, String description, double price, int vat, String imei, int memory) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + ", Smartphone{" +
                "imei='" + imei + '\'' +
                ", memory=" + memory +
                '}';
    }
}