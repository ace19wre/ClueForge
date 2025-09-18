package ba.arpit.crossworder.domain;

import ai.timefold.solver.core.api.domain.variable.PlanningVariable;

public class Word {

    private String word;
    private String clue;

    @PlanningVariable
    private GridPosition position;
    @PlanningVariable
    private Orientation orientation;

    public Word(String word, String clue) {
        this.word = word.toLowerCase();
        this.clue = clue;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word.toLowerCase();
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public GridPosition getPosition() {
        return position;
    }

    public void setPosition(GridPosition position) {
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
