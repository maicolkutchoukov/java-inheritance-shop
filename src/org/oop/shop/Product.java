package org.oop.shop;

import java.util.Random;

public class Product {
    private String productCode;
    private int vat;
    private String name;
    private String description;
    private double price;

    // Random per generare il codice del prodotto
    private final Random random = new Random();

    // Costruttore che genera un codice random
    public Product() {
        int code = random.nextInt(1, 1000000);
        this.productCode = String.format("%06d", code);
    }

    // Costruttore con tutti i parametri
    public Product(String name, String description, double price, int vat) {
        int code = random.nextInt(1000000);
        this.productCode = String.format("%06d", code);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Metodi getter e setter

    public String getProductCode() {
        return productCode;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Metodo per ottenere il prezzo base
    public double getBasePrice() {
        return price;
    }

    // Metodo per ottenere il prezzo comprensivo di IVA
    public double getPriceWithVat() {
        return price + (price * vat / 100);
    }

    // Metodo per ottenere il nome esteso (codice-nome)
    public String getFullName() {
        return productCode + "-" + name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
