package com.product;

public class NonPerishableProduct extends Product {

    String category;

    public NonPerishableProduct(int id, String name, String mfgDate,
                                double price, String category) {
        super(id, name, mfgDate, price);
        this.category = category;
    }

    @Override
    public double calculateTax() {
        return (price * 0.15) + 100;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Non-Perishable");
        System.out.println("Category: " + category);
        System.out.println("Tax: " + calculateTax());
        System.out.println("----------------------");
    }
}
