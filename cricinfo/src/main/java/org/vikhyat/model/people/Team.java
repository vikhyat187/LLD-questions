package org.vikhyat.model.people;

import org.vikhyat.model.people.Player;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private List<SupportStaff> supportStaffs;
    private String tourName;

    public Team(String name, String tourName) {
        this.name = name;
        this.tourName = tourName;
        players = new ArrayList<Player>();
        supportStaffs = new ArrayList<SupportStaff>();
    }

}
