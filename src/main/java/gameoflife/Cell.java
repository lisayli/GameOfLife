package gameoflife;

public class Cell {

    private final LifeStatus lifeStatus;


    public Cell(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }


    public enum LifeStatus {
        ALIVE, DEAD
    }

    public LifeStatus getNextLifeStatus(int state) {
        return LifeStatus.DEAD;
    }
}

