package gameoflife;

import gameoflife.utils.Utils;

import java.util.ArrayList;
import java.util.List;


public class CellLifecycle {
    private Utils firstGeneration;
    private static List<Cell> aliveCells;
    private static List<Cell> deadCells;
    private static List<Cell> neighbours;


    public CellLifecycle() {

    }

    public static List<Cell> getNeighbours() {

        return neighbours;
    }

    public static List<Cell> getDeadCells() {
        return deadCells;
    }

    public static List<Cell> getAliveCells() {
     if (aliveCells.isEmpty()){
         aliveCells = new ArrayList<>();
     }
        return aliveCells;
    }

}
