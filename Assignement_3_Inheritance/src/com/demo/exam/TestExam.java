package com.demo.exam;

import java.util.Scanner;

public class TestExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Java Exam Questions --------
        Question[] javaQ = {
            new Question(1, "Java is?", "Language", "OS", "DB", "Browser", 1, 1),
            new Question(2, "JVM stands for?", "Java Virtual Machine", "Java Variable Method", "None", "All", 1, 1),
            new Question(3, "Keyword for inheritance?", "this", "super", "extends", "final", 3, 1),
            new Question(4, "Size of int?", "2", "4", "8", "1", 2, 1),
            new Question(5, "Default value of int?", "0", "null", "1", "-1", 1, 1)
        };

        Exam javaExam = new Exam(1, "Java Test", "Core Java", "01-01-2025", javaQ);

        // -------- HTML Exam Questions --------
        Question[] htmlQ = {
            new Question(1, "HTML stands for?", "Hyper Text Markup Language", "High Text", "Home Tool", "None", 1, 1),
            new Question(2, "Tag for link?", "<a>", "<p>", "<h1>", "<img>", 1, 1),
            new Question(3, "Tag for image?", "<img>", "<a>", "<div>", "<p>", 1, 1),
            new Question(4, "HTML is?", "Language", "Programming", "Database", "OS", 1, 1),
            new Question(5, "Tag for paragraph?", "<p>", "<h1>", "<div>", "<span>", 1, 1)
        };

        Exam htmlExam = new Exam(2, "HTML Test", "Web", "02-01-2025", htmlQ);

        char ch = 0;

        do {
            System.out.println("\nChoose Exam:");
            System.out.println("1. Java");
            System.out.println("2. HTML");

            int choice = sc.nextInt();

            int marks = 0;

            if (choice == 1) {
                marks = javaExam.conductExam(sc);
            } else if (choice == 2) {
                marks = htmlExam.conductExam(sc);
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("\nTotal Marks: " + marks);

            if (marks >= 3) {
                System.out.println("Congratulations! You completed the test.");
            } else {
                System.out.println("Better luck next time.");
            }

            System.out.print("Do you want to continue (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}