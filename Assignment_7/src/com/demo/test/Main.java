package com.demo.test;

import java.util.*;

import com.demo.service.CityService;
import com.demo.service.CityServiceImpl;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CityService service = new CityServiceImpl();

        while (true) {
        	System.out.println("....Menu.....");
            System.out.println("\n1. Add City");
            System.out.println("2. Find Trees");
            System.out.println("3. Delete City");
            System.out.println("4. Display All");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

            case 1:
                System.out.print("Enter city name: ");
                String city = sc.nextLine();

                System.out.print("Enter number of trees: ");
                int n = sc.nextInt();
                sc.nextLine();

                List<String> trees = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter tree " + (i + 1) + ": ");
                    trees.add(sc.nextLine());
                }

                service.addCity(city, trees);
                break;

            case 2:
                System.out.print("Enter city name: ");
                String c1 = sc.nextLine();

                List<String> result = service.findTrees(c1);

                if (result != null) {
                    System.out.println("Trees: " + result);
                } else {
                    System.out.println("City not found!");
                }
                break;

            case 3:
                System.out.print("Enter city name: ");
                String c2 = sc.nextLine();
                service.deleteCity(c2);
                break;

            case 4:
                service.displayAll();
                break;

            case 5:
                System.exit(0);

            default:
                System.out.println("Invalid choice!");
            }
        }
    }
}