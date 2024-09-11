package gameoflife;

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

    public LifeStatus getNextCellState(int neighbours) {
        // om mindre än 2 granner = DEAD pga underpopulation
        if (neighbours < 2) {
            return LifeStatus.DEAD;
        }
        return lifeStatus;
    }
}

