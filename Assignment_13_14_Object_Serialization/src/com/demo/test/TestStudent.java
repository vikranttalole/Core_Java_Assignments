package com.demo.test;

import java.io.*;
import java.util.*;

import com.demo.model.Student;

public class TestStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        while (true) {
        	System.out.println(".....Menu....");
            System.out.println("\n1. Add Student");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Degree: ");
                String degree = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                list.add(new Student(id, name, degree, email));
                break;

            case 2:
                writeObject(list);
                System.out.println("Data saved in students.dat!");
                System.exit(0);
            }
        }
    }

   
    public static void writeObject(List<Student> list) {

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("students.dat"));

            oos.writeObject(list);   
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}