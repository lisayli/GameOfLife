package gameoflife;

import gameoflife.utils.Utils;

import java.util.List;


public class CellLifecycle {
    private Utils firstGeneration;
    private static List<Cell> aliveCells;
    private static List<Cell> deadCells;
    private static List<Cell> neighbours;
    private final LifeStatus lifeStatus;


    public CellLifecycle(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public static List<Cell> getNeighbours() {
        return neighbours;
    }

    public static List<Cell> getDeadCells() {
        return deadCells;
    }

    public static List<Cell> getAliveCells() {
        return aliveCells;
    }

    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }
}
