package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team<? extends Player>> {

    private List<T> teams = new ArrayList<>();

    public void add(T team) {
        teams.add(team);
    }

    public List<T> getLeagueTable() {
        Collections.sort(teams);
        return teams;
    }
}
