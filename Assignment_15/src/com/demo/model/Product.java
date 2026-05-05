package com.demo.model;

public class Product {

    public int id;
    public String name;
    public int qty;
    public double price;

    public Product(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}