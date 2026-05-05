package com.demo.thread;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.demo.model.Product;
import com.demo.shared.SharedBuffer;

public class Consumer extends Thread {

    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\91983\\Desktop\\Core_Java_Assignments\\Assignment_15\\productamount.dat")
            );

            while (true) {

                Product p = buffer.consume();

                if (p == null) break;   // ✅ stop condition

                double total = p.qty * p.price;
                double amount = total + (0.10 * total);

                String result = p.id + ":" + p.name + ":" + p.qty + ":" + p.price + ":" + amount;

                bw.write(result);
                bw.newLine();

                System.out.println("Consumed: " + result);
            }

            bw.close();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}