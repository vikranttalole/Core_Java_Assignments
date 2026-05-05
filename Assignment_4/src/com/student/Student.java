package com.student;

import java.util.Objects;

public class Student {

    int sid;
    String name, bdate, degree;
    double marks;

    public Student(int sid, String name, String bdate, String degree, double marks) {
        this.sid = sid;
        this.name = name;
        this.bdate = bdate;
        this.degree = degree;
        this.marks = marks;
    }

  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return sid == s.sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid);
    }

    public void display() {
        System.out.println(sid + " " + name + " " + degree + " " + marks);
    }
}