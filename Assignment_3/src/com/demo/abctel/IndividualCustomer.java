package com.demo.abctel;

public class IndividualCustomer extends Customer {

    String phone;

    public IndividualCustomer(String name, String email,
                              String creditClass, double discount,
                              String plan, String phone) {

        super(name, email, creditClass, discount, plan);
        this.phone = phone;
    }

    public void display() {
        super.display();
        System.out.println("Phone: " + phone);
        System.out.println("----------------------");
    }
}