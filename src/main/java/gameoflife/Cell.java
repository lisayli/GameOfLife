package gameoflife;

public class Cell {

    private LifeStatus lifeStatus;
    final private CellLifecycle cellLifecycle;


    public Cell(LifeStatus lifeStatus, CellLifecycle cellLifecycle) {
        this.lifeStatus = lifeStatus;
        this.cellLifecycle = cellLifecycle;

    }
    public boolean checkIfDeadOrAlive(Cell cell){
        if(cell.getLifeStatus().getState().equals(LifeStatus.ALIVE.getState())){
            return CellLifecycle.getAliveCells().add(cell);
        }else if (cell.getLifeStatus().getState().equals(LifeStatus.DEAD.getState())){
            return CellLifecycle.getDeadCells().add(cell);
        }
        return false;
    }


    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }

    public LifeStatus setLifeStatus(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
        return lifeStatus;
    }

    public LifeStatus getNextCellState(int neighboursOfCell) {
        Cell deadCell = new Cell(LifeStatus.DEAD, cellLifecycle);
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

