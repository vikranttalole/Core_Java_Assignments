package com.demo.test;

import java.io.*;
import java.util.*;

import com.demo.model.Student;

public class TestStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        while (true) {
        	System.out.println("...Menu....");
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
                writeToCSV(list);
                System.out.println("Data saved successfully!");
                System.exit(0);
            }
        }
    }


    public static void writeToCSV(List<Student> list) {

        try {
            File file = new File("students.csv");

            boolean isNewFile = !file.exists();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

          
            if (isNewFile) {
                bw.write("ID,Name,Degree,Email");
                bw.newLine();
            }

           
            for (Student s : list) {
                bw.write(s.getStudId() + "," +
                         s.getName() + "," +
                         s.getDegree() + "," +
                         s.getEmail());
                bw.newLine();
            }

            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}