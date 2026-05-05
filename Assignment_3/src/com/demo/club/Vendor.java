package com.demo.club;

public class Vendor extends Employee {

    int noOfEmployees;
    double amount;

    public Vendor(String name, String mobile, String email,
                  String dept, String designation, String doj,
                  int noOfEmployees, double amount) {

        super(name, mobile, email, dept, designation, doj);
        this.noOfEmployees = noOfEmployees;
        this.amount = amount;
    }

    public double calculateSalary() {
        return amount + (amount * 0.18);
    }
}