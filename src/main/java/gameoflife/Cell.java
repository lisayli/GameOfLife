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

    public LifeStatus getNextCellState(int state) {
        if (state == 2){
            return LifeStatus.ALIVE;
        }
        return LifeStatus.DEAD;
    }
}

