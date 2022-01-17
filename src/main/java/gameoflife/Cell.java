package gameoflife;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class Cell {


    private LifeStatus lifeStatus;


    public Cell(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }


    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }

    public LifeStatus setLifeStatus(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
        return lifeStatus;
    }

    public LifeStatus getNextCellState(int neighboursOfCell) {
        Cell deadCell = new Cell(LifeStatus.DEAD);
        if (neighboursOfCell == 2) {
            return LifeStatus.ALIVE;
        } else if (neighboursOfCell > 3) {
            return LifeStatus.DEAD;
        }
        if (deadCell.getLifeStatus().getState().equals("0") && neighboursOfCell ==3){
            return deadCell.setLifeStatus(LifeStatus.ALIVE);
        }
        return LifeStatus.DEAD;

    }
}

