package com.demo.thread;

import java.io.BufferedReader;
import java.io.FileReader;

import com.demo.model.Product;
import com.demo.shared.SharedBuffer;

public class Producer extends Thread {

    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\91983\\Desktop\\Core_Java_Assignments\\Assignment_15\\productdata.dat")
            );

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int qty = Integer.parseInt(data[2]);
                double price = Double.parseDouble(data[3]);

                Product p = new Product(id, name, qty, price);

                System.out.println("Produced: " + name);

                buffer.produce(p);
            }

            br.close();

            buffer.produce(null);   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}