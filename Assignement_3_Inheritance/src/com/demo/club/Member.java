package com.demo.club;

public class Member {

    static int counter = 1;

    int id;
    String name, mobile, email, membershipType;
    double amount;

    public Member(String name, String mobile, String email,
                  String membershipType, double amount) {

        this.id = counter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.membershipType = membershipType;
        this.amount = amount;
    }

    public void display() {
        System.out.println(id + " " + name + " " + membershipType + " " + amount);
    }
}