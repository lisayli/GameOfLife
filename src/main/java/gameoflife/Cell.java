package gameoflife;

public class Cell {

    private LifeStatus lifeStatus;

    public Cell(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;

    }

    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public LifeStatus getNextCellState(int neighbours) {
        // om mindre än 2 granner = DEAD pga underpopulation
        if (neighbours < 2 || neighbours > 3) {
            return LifeStatus.DEAD;
        } else if ( neighbours == 3){
            return LifeStatus.ALIVE;
        }
        return lifeStatus;
    }

    @Override
    public String toString(){
        return lifeStatus == LifeStatus.ALIVE ? "*" : ".";
    }


}

