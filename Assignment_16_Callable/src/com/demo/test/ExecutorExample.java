package com.demo.test;

import java.util.*;
import java.util.concurrent.*;

import com.demo.task.AddTask;

public class ExecutorExample {

    public static void main(String[] args) throws Exception {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 51; i++) {
            numbers.add(i);
        }

        ExecutorService service = Executors.newFixedThreadPool(5);

        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i += 3) {

            int a = numbers.get(i);
            int b = (i + 1 < numbers.size()) ? numbers.get(i + 1) : 0;
            int c = (i + 2 < numbers.size()) ? numbers.get(i + 2) : 0;

            AddTask task = new AddTask(a, b, c);

            Future<Integer> f = service.submit(task);
            futures.add(f);
        }

        int finalSum = 0;

        for (Future<Integer> f : futures) {
            finalSum += f.get();
        }

        service.shutdown();

        System.out.println("Final Addition = " + finalSum);
    }
}