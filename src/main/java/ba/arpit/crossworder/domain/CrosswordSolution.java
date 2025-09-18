package ba.arpit.crossworder.domain;

import ai.timefold.solver.core.api.domain.solution.PlanningEntityCollectionProperty;
import ai.timefold.solver.core.api.domain.solution.PlanningSolution;
import ai.timefold.solver.core.api.domain.valuerange.ValueRangeProvider;

import java.util.List;

@PlanningSolution
public class CrosswordSolution {

    @PlanningEntityCollectionProperty
    public List<Word> wordList;
    @ValueRangeProvider(id = "gridPositionRange")
    public List<GridPosition> gridPositionList;
    @ValueRangeProvider(id = "orientationRange")
    public List<Orientation> orientationList;

    public CrosswordSolution(List<Word> wordList, List<GridPosition> gridPositionList) {
        this.wordList = wordList;
        this.gridPositionList = gridPositionList;
        this.orientationList = List.of(Orientation.ACROSS, Orientation.DOWN);
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    public List<GridPosition> getGridPositionList() {
        return gridPositionList;
    }

    public void setGridPositionList(List<GridPosition> gridPositionList) {
        this.gridPositionList = gridPositionList;
    }

    public List<Orientation> getOrientationList() {
        return orientationList;
    }

    public void setOrientationList() {
        this.orientationList = List.of(Orientation.ACROSS, Orientation.DOWN);
    }
}
