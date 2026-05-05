package com.student;

import java.util.*;

public class TestStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Student, ArrayList<String>> map = new HashMap<>();

        int choice;

        do {
            System.out.println("\n1 Add Student");
            System.out.println("2 Add Skill");
            System.out.println("3 Delete Student");
            System.out.println("4 Delete Skill");
            System.out.println("5 Display by Skill");
            System.out.println("6 Display by Degree");
            System.out.println("7 Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Birthdate: ");
                    String bdate = sc.nextLine();

                    System.out.print("Enter Degree: ");
                    String degree = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, bdate, degree, marks);

                    map.put(s, new ArrayList<>());
                    break;

                // ✅ Add Skill
                case 2:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (st.sid == sid) {
                            System.out.print("Enter Skill: ");
                            String skill = sc.nextLine();

                            map.get(st).add(skill);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    map.keySet().removeIf(st -> st.sid == did);
                    break;

               
                case 4:
                    System.out.print("Enter Student ID: ");
                    int sid2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Skill: ");
                    String skill = sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (st.sid == sid2) {
                            map.get(st).remove(skill);
                        }
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Skill: ");
                    String sk = sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (map.get(st).contains(sk)) {
                            st.display();
                        }
                    }
                    break;

                
                case 6:
                    sc.nextLine();
                    System.out.print("Enter Degree: ");
                    String deg = sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (st.degree.equalsIgnoreCase(deg)) {
                            st.display();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}