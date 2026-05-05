package com.secondquestion;

import java.util.Scanner;

public class StudentData {
	private int stuid;
	private String stuname;
	private double m1;
	private double m2;
	private double m3;


	public void acceptdata() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student id :");
		stuid = sc.nextInt();

		System.out.println("Enter Student Name:");
		stuname = sc.next();

		System.out.println("Enter the First Subject Marks:");
		m1 = sc.nextDouble();

		System.out.println("Enter the second subject marks :");
		m2 = sc.nextDouble();

		System.out.println("Enter the third subject marks :");
		m3 = sc.nextDouble();
	

	}

	public void displaydata() {
		System.out.println("\n.....Student Details........\n");
		System.out.println("Student id is :" + stuid);
		System.out.println("Student name is :" + stuname);
		System.out.println("First Subject Marks is:" + m1);
		System.out.println("Second Subject Marks is :" + m2);
		System.out.println("Third Subject Marks is :" + m3);
		
	}

}

//2. Write a program to maintain student information. For each student store studid, name, m1,
//m2 and m3 (marks of 3 subjects ). Accept information for 2 students and display it as
//follows.
//Student Details:
//____________
//Student Id
//Name: Divya
//M1 : 78
//M2: 86
//M3: 89