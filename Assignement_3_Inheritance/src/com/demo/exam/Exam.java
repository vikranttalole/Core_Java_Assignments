package com.demo.exam;

import java.util.Scanner;

public class Exam {

    int examId;
    String name, topic, date;
    Question[] questions;

    public Exam(int examId, String name, String topic, String date, Question[] questions) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.questions = questions;
    }

    public int conductExam(Scanner sc) {
        int totalMarks = 0;

        for (int i = 0; i < questions.length; i++) {
            totalMarks += questions[i].askQuestion(sc);
        }

        return totalMarks;
    }
}