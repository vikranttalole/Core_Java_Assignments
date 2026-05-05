package com.demo.test;

import com.demo.shared.SharedBuffer;
import com.demo.thread.Consumer;
import com.demo.thread.Producer;

public class TestPC {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}