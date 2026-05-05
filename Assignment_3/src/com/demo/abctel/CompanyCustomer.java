package com.demo.abctel;

import java.util.Arrays;

public class CompanyCustomer extends Customer {

    String relationshipManager;
    double creditLine;
    int extensions;
    String[] numbers;

    public CompanyCustomer(String name, String email,
                           String creditClass, double discount,
                           String plan, String relationshipManager,
                           double creditLine, int extensions,
                           String[] numbers) {

        super(name, email, creditClass, discount, plan);
        this.relationshipManager = relationshipManager;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

    public void display() {
        super.display();
        System.out.println("Relationship Manager: " + relationshipManager);
        System.out.println("Credit Line: " + creditLine);
        System.out.println("Extensions: " + extensions);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("----------------------");
    }
}