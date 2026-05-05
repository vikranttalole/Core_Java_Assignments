package com.product;

public class PerishableProduct extends Product {

    String expDate;

    public PerishableProduct(int id, String name, String mfgDate,double price, String expDate) {
        super(id, name, mfgDate, price);
        this.expDate = expDate;
    }

    @Override
    public double calculateTax() {
        return price * 0.05;   // 5% tax
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Perishable");
        System.out.println("Exp Date: " + expDate);
        System.out.println("Tax: " + calculateTax());
        System.out.println("----------------------");
    }
}
