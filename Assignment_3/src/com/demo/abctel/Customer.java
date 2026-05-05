package com.demo.abctel;

public class Customer {

    static int counter = 1;

    int custId;
    String name, email;
    String creditClass;
    double discount;
    String plan;

    public Customer(String name, String email,
                    String creditClass, double discount, String plan) {

        this.custId = counter++;
        this.name = name;
        this.email = email;
        this.creditClass = creditClass;
        this.discount = discount;
        this.plan = plan;
    }

    public void display() {
        System.out.println("Customer ID: " + custId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Credit Class: " + creditClass);
        System.out.println("Discount: " + discount);
        System.out.println("Plan: " + plan);
    }
}