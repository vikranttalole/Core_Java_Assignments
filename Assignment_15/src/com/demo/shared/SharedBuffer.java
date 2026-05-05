package com.demo.shared;

import com.demo.model.Product;

public class SharedBuffer {

    private Product product;
    private boolean available = false;

    public synchronized void produce(Product p) {
        try {
            while (available) {
                wait();
            }
            product = p;
            available = true;
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Product consume() {
        try {
            while (!available) {
                wait();
            }
            Product temp = product;
            available = false;
            notify();
            return temp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}