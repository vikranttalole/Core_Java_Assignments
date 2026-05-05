package com.ipl;

import java.util.ArrayList;

public class Team {

    int teamId;
    String tname, coach;
    ArrayList<Player> players;

    public Team(int teamId, String tname, String coach) {
        this.teamId = teamId;
        this.tname = tname;
        this.coach = coach;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void display() {
        System.out.println("\nTeam: " + tname + " Coach: " + coach);
        for (Player p : players) {
            p.display();
        }
    }
}