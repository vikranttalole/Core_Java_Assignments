package com.demo.test;

import java.util.Scanner;

import com.demo.service.CartService;
import com.demo.service.CartServiceImpl;

public class TestCartProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartService service = new CartServiceImpl();

        while (true) {

        	System.out.println("....Menu.....");
            System.out.println("\n1. Buy Products");
            System.out.println("2. Send Delivery");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                System.out.print("Enter username: ");
                String username = sc.next();
                service.buyProduct(username);
                break;

            case 2:
                service.deliverCart();
                break;

            case 3:
            	System.out.println("");
                System.exit(0);

            default:
                System.out.println("Invalid choice!");
            }
        }
    }
}