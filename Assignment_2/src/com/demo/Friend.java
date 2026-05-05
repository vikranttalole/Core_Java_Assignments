package com.demo;

public class Friend {
    int id;
    String name;
    String lastname;
    String[] hobbies;
    String mobno;
    String email;
    String bdate;
    String address;

    public Friend(int id, String name, String lastname, String[] hobbies,
                  String mobno, String email, String bdate, String address) {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.hobbies = hobbies;
        this.mobno = mobno;
        this.email = email;
        this.bdate = bdate;
        this.address = address;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name + " " + lastname);

        System.out.print("Hobbies: ");
        for (String h : hobbies) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Mobile: " + mobno);
        System.out.println("Email: " + email);
        System.out.println("Birthdate: " + bdate);
        System.out.println("Address: " + address);
        System.out.println("--------------------------");
    }
}


 

