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
