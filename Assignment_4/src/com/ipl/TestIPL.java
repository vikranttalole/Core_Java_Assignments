package com.ipl;

import java.util.*;

public class TestIPL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        int choice;

        do {
        	System.out.println(".....Menu.....");
            System.out.println("\n1 Add Team");
            System.out.println("2 Delete Team");
            System.out.println("3 Delete Player");
            System.out.println("4 Display All Batsman");
            System.out.println("5 Display by Speciality");
            System.out.println("6 Add Player to Team");
            System.out.println("7 Modify Coach");
            System.out.println("8 Exit");

            choice = sc.nextInt();

            switch (choice) {


                case 1:
                    System.out.print("Enter Team ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Team Name: ");
                    String tname = sc.nextLine();

                    System.out.print("Enter Coach Name: ");
                    String coach = sc.nextLine();

                    teams.add(new Team(tid, tname, coach));
                    break;

                
                case 2:
                    System.out.print("Enter Team ID to delete: ");
                    int dtid = sc.nextInt();

                    teams.removeIf(t -> t.teamId == dtid);
                    break;

               
                case 3:
                    System.out.print("Enter Player ID: ");
                    int pid = sc.nextInt();

                    for (Team t : teams) {
                        t.players.removeIf(p -> p.pid == pid);
                    }
                    break;

              
                case 4:
                    for (Team t : teams) {
                        for (Player p : t.players) {
                            if (p.speciality.equalsIgnoreCase("batsman")) {
                                p.display();
                            }
                        }
                    }
                    break;

                // ✅ Display by Speciality
                case 5:
                    sc.nextLine();
                    System.out.print("Enter speciality: ");
                    String sp = sc.nextLine();

                    for (Team t : teams) {
                        for (Player p : t.players) {
                            if (p.speciality.equalsIgnoreCase(sp)) {
                                p.display();
                            }
                        }
                    }
                    break;

                
                case 6:
                    System.out.print("Enter Team ID: ");
                    int teamId = sc.nextInt();

                    for (Team t : teams) {
                        if (t.teamId == teamId) {

                            System.out.print("Enter Player ID: ");
                            int pId = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Name: ");
                            String pname = sc.nextLine();

                            System.out.print("Enter Speciality: ");
                            String spec = sc.nextLine();

                            t.addPlayer(new Player(pId, pname, spec));
                        }
                    }
                    break;

                
                case 7:
                    System.out.print("Enter Team ID: ");
                    int mtid = sc.nextInt();
                    sc.nextLine();

                    for (Team t : teams) {
                        if (t.teamId == mtid) {
                            System.out.print("Enter New Coach: ");
                            t.coach = sc.nextLine();
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}

//1. Write a program to store information about IPL teams in ArrayList
//Create Team class to store teamid, tname, coachname, and list of players. 
//and perform following operations 
//1. add new Team 
//2. delete a team
//3. delete a player from team(accept player id to delete) 
//4. display all batsman 
//5. display all player with a speciality(accept speciality from user) 
//6. add a new player in a team 
//7. modify coach of a team 
//8. exit 