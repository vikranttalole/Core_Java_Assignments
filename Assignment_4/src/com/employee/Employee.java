package com.employee;

import java.util.Objects;

public class Employee {

    int id;
    String name, dept, designation;
    double sal;

    public Employee(int id, String name, String dept, String designation, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.designation = designation;
        this.sal = sal;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void display() {
        System.out.println(id + " " + name + " " + dept + " " + designation + " " + sal);
    }
}

//Q4. Use employee class to store id,name,sal,dept and designation. 
//a. Use HashSet to store multiple employee objects.
//Add required functions in the appropriate class. 
//No duplicate employee entries are allowed.
//-2 Employee objects are same if their id is same     
//b. Use Treemap to store multiple Employee objects. 
//Add required functions in the appropriate class. 