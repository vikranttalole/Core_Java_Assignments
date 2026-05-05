package com.product;

public class Product {
	
	int id;
    String name, mfgDate;
    double price;

    public Product(int id, String name, String mfgDate, double price) {
        this.id = id;
        this.name = name;
        this.mfgDate = mfgDate;
        this.price = price;
    }

    public double calculateTax() {
        return 0; 
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mfg Date: " + mfgDate);
        System.out.println("Price: " + price);
    }
}
