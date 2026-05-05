package com.demo.test;

import java.io.*;
import java.util.*;

import com.demo.model.Student;

public class ReadStudent {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91983\\Desktop\\Core_Java_Assignments\\Assignment_11\\students.csv"));

            String line;

            while ((line = br.readLine()) != null) {

                
                if (line.startsWith("ID")) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String degree = data[2];
                String email = data[3];

                list.add(new Student(id, name, degree, email));
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

     
      
        System.out.println("---- Student List ----");
        for (Student s : list) {
            System.out.println(s);
        }
    }
    
}