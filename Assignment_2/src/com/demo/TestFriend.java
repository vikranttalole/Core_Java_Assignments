package com.demo;

import java.util.Scanner;

public class TestFriend {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Friend[] f = new Friend[5];
        int count = 0;
        int choice;

        do {
        	System.out.println("....Menu.....");
            System.out.println("1. Add Friend");
            System.out.println("2. Display All Friend");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Hobby");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < f.length) {

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Last Name: ");
                        String lname = sc.nextLine();

                        System.out.print("Enter number of hobbies: ");
                        int n = sc.nextInt();
                        sc.nextLine();

                        String[] hobbies = new String[n];
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter hobby " + (i + 1) + ": ");
                            hobbies[i] = sc.nextLine();
                        }

                        System.out.print("Enter Mobile: ");
                        String mob = sc.nextLine();

                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();

                        System.out.print("Enter Birthdate: ");
                        String bdate = sc.nextLine();

                        System.out.print("Enter Address: ");
                        String address = sc.nextLine();

                        f[count++] = new Friend(id, name, lname, hobbies, mob, email, bdate, address);

                    } else {
                        System.out.println("Array is full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No data available");
                    } else {
                        for (int i = 0; i < count; i++) {
                            f[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (f[i].id == sid) {
                            f[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Friend not found");
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String sname = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (f[i].name.equalsIgnoreCase(sname)) {
                            f[i].display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Friend not found");
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Hobby: ");
                    String hobby = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {

                        for (String h : f[i].hobbies) {
                            if (h.equalsIgnoreCase(hobby)) {
                                f[i].display();
                                found = true;
                                break;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("No friend with this hobby");
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

//Q2. Write a java program to store information of your friends 
//id,name,lastname,hobbies,mobno,email,bdate,address 
//note: hobbies- a friend may have multiple hobbies 
//Accept all friends details and store it in an array 
//And do the following. 
//1. Display All Friend 
//2. Search by id 
//3. Search by name 
//4. Display all friend with a particular hobby    
//5. Exit
