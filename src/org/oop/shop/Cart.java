package org.oop.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi aggiungere al carrello?");
        int numProducts = Integer.parseInt(scanner.nextLine());

        Product[] cart = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Inserisci il tipo di prodotto (smartphone, televisore, cuffie):");
            String productType = scanner.nextLine();

            System.out.println("Inserisci il nome del prodotto:");
            String name = scanner.nextLine();

            System.out.println("Inserisci la descrizione del prodotto:");
            String description = scanner.nextLine();

            System.out.println("Inserisci il prezzo del prodotto:");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Inserisci l'IVA del prodotto:");
            int vat = Integer.parseInt(scanner.nextLine());

            boolean fedelityCard;
            System.out.println("Hai la carta fedeltà? (true/false):");
            fedelityCard = scanner.nextBoolean();
            scanner.nextLine();

            switch (productType.toLowerCase()) {
                case "smartphone":
                    System.out.println("Inserisci il codice IMEI:");
                    String imei = scanner.nextLine();

                    System.out.println("Inserisci la quantità di memoria (GB):");
                    int memory = Integer.parseInt(scanner.nextLine());

                    cart[i] = new Smartphone(name, description, price, vat, imei, memory);
                    break;

                case "televisore":
                    System.out.println("Inserisci le dimensioni del televisore (pollici):");
                    int size = Integer.parseInt(scanner.nextLine());

                    System.out.println("Il televisore è smart? (true/false):");
                    boolean isSmart = scanner.nextBoolean();
                    scanner.nextLine();

                    cart[i] = new Television(name, description, price, vat, size, isSmart);
                    break;

                case "cuffie":
                    System.out.println("Inserisci il colore delle cuffie:");
                    String color = scanner.nextLine();

                    System.out.println("Le cuffie sono wireless? (true/false):");
                    boolean isWireless = scanner.nextBoolean();
                    scanner.nextLine();

                    cart[i] = new Headphone(name, description, price, vat, color, isWireless);
                    break;

                default:
                    System.out.println("Tipo di prodotto non valido!");
                    i--; // Decrementa i per ripetere l'input corrente
                    break;
            }
        }
/*
    BONUS : Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà,
    che applica al prezzo uno sconto del 2%. Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore
    a 32GB, altrimenti rimane del 2%. Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%.
    Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.
    Nella classe carrello chiedere all’utente se possiede una carta fedeltà In base alla risposta, calcolare il totale del
    carrello come somma dei prezzi base o dei prezzi scontati.
*/



        System.out.println("Carrello:");
        for (Product product : cart) {
            System.out.println(product);
        }

        scanner.close();
    }
}
