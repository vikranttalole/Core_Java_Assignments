package com.secondquestion;
import com.secondquestion.StudentData;

public class TestStudent {

	public static void main(String[] args) {
		StudentData s= new StudentData();
		System.out.println("Enter the data of first student ");
		s.acceptdata();
		
		StudentData s1= new StudentData();
		System.out.println("Enter the data of second student ");
		s1.acceptdata();
		
		s.displaydata();
		s1.displaydata();
		
			
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
