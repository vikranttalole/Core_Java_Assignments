package com.employee;

import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, Employee> map = new TreeMap<>();

        map.put(1, new Employee(1, "A", "IT", "Dev", 50000));
        map.put(2, new Employee(3, "B", "HR", "Manager", 60000));
        map.put(3, new Employee(2, "C", "Sales", "Exec", 40000));

        for (Employee e : map.values()) {
            e.display();
        }
    }
}