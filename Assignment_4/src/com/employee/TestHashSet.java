package com.employee;

import java.util.HashSet;

public class TestHashSet {

    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(1, "A", "IT", "Dev", 50000));
        set.add(new Employee(2, "B", "HR", "Manager", 60000));
        set.add(new Employee(1, "C", "IT", "Tester", 40000)); //duplicate ID

        for (Employee e : set) {
            e.display();
        }
    }
}