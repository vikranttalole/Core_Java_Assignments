package com.demo.abctel;

import java.util.Arrays;

public class Vendor {

    int vendorId;
    String name, email, phone;
    String[] products;

    public Vendor(int vendorId, String name, String email,
                  String phone, String[] products) {

        this.vendorId = vendorId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.products = products;
    }

    public void display() {
        System.out.println("Vendor ID: " + vendorId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Products: " + Arrays.toString(products));
        System.out.println("----------------------");
    }
}