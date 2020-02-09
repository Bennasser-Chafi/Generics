package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Team<FootballPlayer> barca = new Team<>("Barca", 45);
        Team<FootballPlayer> real = new Team<>("Real", 20);
        Team<FootballPlayer> atlitico = new Team<>("Atletico", 29);

        Team<SoccerPlayer> chicago = new Team<>("chicago", 29);

        League<Team<FootballPlayer>> league = new League<>();
        league.add(barca);
        league.add(real);
        league.add(atlitico);
        //league.add(chicago); // will not work only accepts football teams

        System.out.println(Arrays.toString(league.getLeagueTable().toArray()));

    }
}
