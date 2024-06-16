package org.vikhyat.model.match;


import lombok.Getter;
import lombok.Setter;
import org.vikhyat.model.people.Commentator;
import org.vikhyat.model.people.Referee;
import org.vikhyat.model.people.Umpire;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.MatchResult;

@Getter
@Setter
public abstract class Match {
    private String matchId;
    private Tournament tournament;
    private final TeamsBetween teamsBetween;
    private String venue;
    private Toss toss;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Umpire> umpires;
    private String winner;
    private String lost;
    private MatchResult matchResult;
    private Map<Integer, Innings> innings;
    private List<Commentator> commentators;
    private List<Referee> referees;

    public Match(TeamsBetween teamsBetween) {
        this.teamsBetween = teamsBetween;
        umpires = new ArrayList<>();
        innings = new HashMap<>();
        commentators = new ArrayList<>();
        referees = new ArrayList<>();
    }
}