package com.demo.club;

import java.util.Scanner;

public class TestClub {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[10];
        int count = 0;

        int choice;

        do {
        	System.out.println("...Menu...");
            System.out.println("1 Add Employee");
            System.out.println("2 Display by Type");
            System.out.println("3 Search by ID");
            System.out.println("4 Search by Name");
            System.out.println("5 Display All");
            System.out.println("6 Salary by Designation");
            System.out.println("7 Dept Employees");
            System.out.println("8 Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("1 Salaried 2 Contract 3 Vendor");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Mobile: ");
                    String mob = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Dept: ");
                    String dept = sc.nextLine();

                    System.out.print("Designation: ");
                    String desig = sc.nextLine();

                    System.out.print("DOJ: ");
                    String doj = sc.nextLine();

                    if (type == 1) {
                        System.out.print("Basic: ");
                        double basic = sc.nextDouble();

                        emp[count++] = new SalariedEmployee(name, mob, email, dept, desig, doj, basic);

                    } else if (type == 2) {
                        System.out.print("Hours: ");
                        int h = sc.nextInt();

                        System.out.print("Rate: ");
                        double r = sc.nextDouble();

                        emp[count++] = new ContractEmployee(name, mob, email, dept, desig, doj, h, r);

                    } else {
                        System.out.print("No of Employees: ");
                        int n = sc.nextInt();

                        System.out.print("Amount: ");
                        double amt = sc.nextDouble();

                        emp[count++] = new Vendor(name, mob, email, dept, desig, doj, n, amt);
                    }
                    break;

                case 2:
                    System.out.println("1 Salaried 2 Contract 3 Vendor");
                    int t = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if ((t == 1 && emp[i] instanceof SalariedEmployee) ||
                            (t == 2 && emp[i] instanceof ContractEmployee) ||
                            (t == 3 && emp[i] instanceof Vendor)) {

                            emp[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (emp[i].id == id) {
                            emp[i].display();
                        }
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String nm = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (emp[i].name.equalsIgnoreCase(nm)) {
                            emp[i].display();
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < count; i++) {
                        emp[i].display();
                    }
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter designation: ");
                    String d = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (emp[i].designation.equalsIgnoreCase(d)) {
                            System.out.println("Salary: " + emp[i].calculateSalary());
                        }
                    }
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Enter department: ");
                    String dp = sc.nextLine();
                    int c = 0;

                    for (int i = 0; i < count && c < 5; i++) {
                        if (emp[i].dept.equalsIgnoreCase(dp)) {
                            emp[i].display();
                            c++;
                        }
                    }
                    break;
            }

        } while (choice != 8);

        sc.close();
    }
}


//Write a java application to maintain information for xyz sports club.
//The sports club wants to store employee details, 
//for each employee store id, name, mobile no, emailid, Department, designation, Date of joining. 
//Employees are of 3 types salaried employee or contract employee,Vendors. 
//If employee is salaried employee, then store basic salary 
//and if it is contract employee then store no of hrs worked and per hour rate 
//and if it is vendor then store no_of _employees, amount Also store information about members of club
//For each member store id, name, mobile no, emailid, type of membership, amount paid.
//For employee and members, id is autogenerated design a menu driven program to perform following
//Calculate net salary by using following formula 
//1. Salaried Employee Basic+DA+HRA-pf DA-10% of basic HRA – 15% of basic Pf – 12% of Basic
//2. Contract Employee Hr rate * no of hrs worked 
//3 Vendor amt+Amt*18% GST Also store information about members of club
//For each member store id, name, mobile no, emailid, type of membership, amount paid. For employee and members, id is autogenerated design a menu driven program to perform following 
//1. Display All employees (ask user salaried/contract employee display only one type of emplyees based on selection)
//2. Search by id 
//3. Search by name 
//4. Display all employee 
//5. calculate salary and display for all emplyees with particular designation 
//6. accept department from user and display
//5 employees of that department.
//6. Exit