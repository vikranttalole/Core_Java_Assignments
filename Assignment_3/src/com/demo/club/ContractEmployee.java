package com.demo.club;

public class ContractEmployee extends Employee {

    int hours;
    double rate;

    public ContractEmployee(String name, String mobile, String email,
                            String dept, String designation, String doj,
                            int hours, double rate) {

        super(name, mobile, email, dept, designation, doj);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }
}