package com.demo.test;

import java.util.Scanner;
import com.demo.model.Grade;

public class GradeExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade (DISTINCTION/FIRST/SECOND/PASS/FAIL): ");
        String input = sc.nextLine().toUpperCase();

        try {
            Grade g = Grade.valueOf(input);

            System.out.println("Minimum Marks: " + g.getMin());
            System.out.println("Maximum Marks: " + g.getMax());

        } catch (Exception e) {
            System.out.println("Invalid Grade!");
        }
    }
}