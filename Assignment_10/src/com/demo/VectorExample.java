package com.demo;

import java.util.*;

public class VectorExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<String> v = new Vector<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            v.add(sc.nextLine());
        }

        System.out.println("Elements using Enumeration:");

        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}