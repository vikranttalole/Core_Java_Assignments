package com.demo.club;

public class Employee {

    static int counter = 1;

    int id;
    String name, mobile, email, dept, designation, doj;

    public Employee(String name, String mobile, String email,
                    String dept, String designation, String doj) {

        this.id = counter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.dept = dept;
        this.designation = designation;
        this.doj = doj;
    }

    public void display() {
        System.out.println(id + " " + name + " " + dept + " " + designation);
    }

    public double calculateSalary() {
        return 0; 
    }
}