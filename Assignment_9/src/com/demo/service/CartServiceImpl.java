package com.demo.service;

import java.util.*;

import com.demo.model.Product;

public class CartServiceImpl implements CartService {

    private static List<Product> productList = new ArrayList<>();
    private Map<String, List<Product>> cartMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

   
    static {
        productList.add(new Product(1, "Shoes", 3000, 10));
        productList.add(new Product(2, "Shirts", 1500, 20));
        productList.add(new Product(3, "Bags", 2000, 15));
        productList.add(new Product(4, "Watch", 2500, 8));
        productList.add(new Product(5, "Mobile", 15000, 5));
        productList.add(new Product(6, "Laptop", 50000, 3));
        productList.add(new Product(7, "Headphones", 1200, 25));
        productList.add(new Product(8, "Jeans", 1800, 12));
        productList.add(new Product(9, "T-Shirt", 800, 30));
        productList.add(new Product(10, "Bottle", 300, 50));
    }

    @Override
    public void buyProduct(String username) {

        System.out.println("Available Products:");
        for (Product p : productList) {
            System.out.println(p.getId() + ". " + p.getName() + " Price: " + p.getPrice());
        }

        System.out.print("Enter choice (product id): ");
        int choice = sc.nextInt();

        Product selected = null;

        for (Product p : productList) {
            if (p.getId() == choice) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Invalid product!");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        if (qty > selected.getQty()) {
            System.out.println("Not enough stock!");
            return;
        }

        double amount = qty * selected.getPrice();
        System.out.println("Amount = " + amount);

        // reduce stock
        selected.setQty(selected.getQty() - qty);

        // add to cart
        Product cartProduct = new Product(selected.getId(), selected.getName(), selected.getPrice(), qty);

        List<Product> userCart = cartMap.getOrDefault(username, new ArrayList<>());
        userCart.add(cartProduct);
        cartMap.put(username, userCart);

        System.out.println("Product added to cart!");
    }

    @Override
    public void deliverCart() {

        if (cartMap.isEmpty()) {
            System.out.println("No carts available!");
            return;
        }

        System.out.println("Users:");
        for (String user : cartMap.keySet()) {
            System.out.println(user);
        }

        System.out.print("Enter username: ");
        String username = sc.next();

        List<Product> cart = cartMap.get(username);

        if (cart == null) {
            System.out.println("User not found!");
            return;
        }

        double total = 0;

        System.out.println("---- BILL ----");
        for (Product p : cart) {
            double amt = p.getPrice() * p.getQty();
            total += amt;
            System.out.println(p.getName() + " x " + p.getQty() + " = " + amt);
        }

        System.out.println("Total = " + total);

        System.out.print("Do you want to deliver (y/n): ");
        char ch = sc.next().charAt(0);

        if (ch == 'y' || ch == 'Y') {
            System.out.println("Order Delivered!");
            cartMap.remove(username);
        }
    }
}