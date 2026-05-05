package com.firstquestion;

public class PrimeTable {
	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for(int i=2; i<=num/2; i++) {
			if(num%1==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Please Enter the 3 numbers as command ");
			return;

		}
		for (int i = 0; i < 3; i++) {
			int num = Integer.parseInt(args[i]);

			if (isPrime(num)) {
				//is prime function check the number is prime or not from the loop
				System.out.println("Number\n" + num + " is an Prime Number");
				System.out.println("Table of\n" + num + ":");
				for(int j=0; j<=10; j++) {
					System.out.println(num+"x"+j+"="+(num*j));
					//here we take input num from user and goes in loop if the number is prime 
					//we take the for loop for table printing the table upto 10 with the num
					//and num e.g 3x1=3 
				}
			}
			else {
				System.out.println("Number\n"+num+"\n is not an prime number");
				System.out.println("After Dividing by 10\n"+(num/10.0));
			}
			System.out.println("------------------");
		}
	}

	

}

//1. Accept 3 numbers from command line arguments. 
//If number is prime, then print the table of the number. 
//Other wise divide number by 10 and display output



