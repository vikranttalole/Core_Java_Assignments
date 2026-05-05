package com.demo.model;

import java.io.Serializable;

public class Student implements Serializable {

    private int studId;
    private String name;
    private String degree;
    private String email;

    public Student(int studId, String name, String degree, String email) {
        this.studId = studId;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    @Override
    public String toString() {
        return studId + " | " + name + " | " + degree + " | " + email;
    }
}