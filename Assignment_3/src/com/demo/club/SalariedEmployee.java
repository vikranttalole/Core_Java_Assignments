package com.demo.club;

public class SalariedEmployee extends Employee {

    double basic;

    public SalariedEmployee(String name, String mobile, String email,
                            String dept, String designation, String doj,
                            double basic) {

        super(name, mobile, email, dept, designation, doj);
        this.basic = basic;
    }

    public double calculateSalary() {
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double pf = 0.12 * basic;

        return basic + da + hra - pf;
    }
}