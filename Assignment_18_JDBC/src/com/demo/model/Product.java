package com.demo.model;
public class Product {

    private int productId;
    private String pname;
    private double price;
    private int qty;

    public Product() {}

    public Product(int productId, String pname, double price, int qty) {
        this.productId = productId;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
    }

    public int getProductId() {
        return productId;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
