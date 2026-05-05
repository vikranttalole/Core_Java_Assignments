package com.thirdquestion;

import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[5];
        int count = 0;

        int choice;

        do {
        	System.out.println("....Menu.....");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Student");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Calculate GPA");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < s.length) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter m1, m2, m3: ");
                        double m1 = sc.nextDouble();
                        double m2 = sc.nextDouble();
                        double m3 = sc.nextDouble();

                        s[count++] = new Student(id, name, m1, m2, m3);
                        System.out.println("Student Added Successfully");
                    } else {
                        System.out.println("Array is full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students available");
                    } else {
                        for (int i = 0; i < count; i++) {
                            s[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (s[i].id == sid) {
                            s[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Name to search: ");
                    String sname = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (s[i].name.equalsIgnoreCase(sname)) {
                            s[i].display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to calculate GPA: ");
                    int gid = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (s[i].id == gid) {
                            double gpa = s[i].calculateGPA();
                            System.out.println("GPA: " + gpa);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}