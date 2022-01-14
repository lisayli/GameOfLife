package gameoflife;

public class Cell {

    private final LifeStatus lifeStatus;


    public Cell(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }


    public enum LifeStatus {
        ALIVE, DEAD
    }

    public LifeStatus getNextCellState(int neighboursOfCell) {
        if (neighboursOfCell == 2) {
            return LifeStatus.ALIVE;
        } else if (neighboursOfCell > 3) {
            return LifeStatus.DEAD;
        }
        return LifeStatus.DEAD;
    }


}

