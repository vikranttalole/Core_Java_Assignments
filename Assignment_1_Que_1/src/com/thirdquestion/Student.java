package com.thirdquestion;

public class Student {

    int id;
    String name;
    double m1, m2, m3;
    double gpa;

   
    public Student(int id, String name, double m1, double m2, double m3) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public double calculateGPA() {
        gpa = (1.0/3)*m1 + (1.0/2)*m2 + (1.0/4)*m3;
        return gpa;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("----------------------");
    }
}