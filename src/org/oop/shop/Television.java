package org.oop.shop;

public class Television extends Product{
    private int size;
    private boolean isSmart;

    public Television(String name, String description, double price, int vat, int size, boolean isSmart) {
        super(name, description, price, vat);
        this.size = size;
        this.isSmart = isSmart;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + ", Television{" +
                "size=" + size +
                ", isSmart=" + isSmart +
                '}';
    }
}

