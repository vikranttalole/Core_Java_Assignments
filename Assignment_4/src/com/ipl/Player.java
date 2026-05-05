package com.ipl;

public class Player {

    int pid;
    String name;
    String speciality; 

    public Player(int pid, String name, String speciality) {
        this.pid = pid;
        this.name = name;
        this.speciality = speciality;
    }

    public void display() {
        System.out.println(pid + " " + name + " " + speciality);
    }
}