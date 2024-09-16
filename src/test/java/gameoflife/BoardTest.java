package gameoflife;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    /*
  board1 första generation:
  ......
  ....*.
  ...**.
  ......
   */
    @Test
    void testFirstGenerationLifeStatus_Alive() throws IOException {
        Board gameBoard = new Board("src/main/resources/board1.txt");

        List<List<Cell>> cells = gameBoard.getBoard();
        assertEquals(LifeStatus.ALIVE, cells.get(1).get(4).getLifeStatus());
        assertEquals(LifeStatus.ALIVE, cells.get(2).get(3).getLifeStatus());
        assertEquals(LifeStatus.ALIVE, cells.get(2).get(4).getLifeStatus());

    }

    @Test
    void testFirstGenerationLifeStatus_Dead() throws IOException {
        Board gameBoard = new Board("src/main/resources/board1.txt");

        List<List<Cell>> cells = gameBoard.getBoard();

        assertEquals(LifeStatus.DEAD, cells.get(0).get(0).getLifeStatus());
        assertEquals(LifeStatus.DEAD, cells.get(1).get(2).getLifeStatus());
        assertEquals(LifeStatus.DEAD, cells.get(3).get(4).getLifeStatus());

    }

    @Test
    void countNeighboursInGeneration1() throws IOException {
        Board gameBoard = new Board("src/main/resources/board1.txt");
        /*
        Generation 1:
        ......
        ....*.
        ...**.
        ......
        */

        assertEquals(2, gameBoard.countAliveNeighbours(1, 4));
        assertEquals(2, gameBoard.countAliveNeighbours(2, 3));
        assertEquals(2, gameBoard.countAliveNeighbours(2, 4));
       // assertEquals(0, gameBoard.countAliveNeighbours(0, 0));
    }


    @Test
    void generationOneToSecondGenerationNeighbourCount() throws IOException {
         /*
        Generation 1:
        ......
        ....*.
        ...**.
        ......
        */
        Board board = new Board("src/main/resources/board1.txt");

        board.getNextGeneration();

        List<List<Cell>> cells = board.getBoard();

         /*
        Generation 2:
        ......
        ...**.
        ...**.
        ......
        */

        assertEquals(LifeStatus.ALIVE, cells.get(1).get(3).getLifeStatus());
        assertEquals(LifeStatus.ALIVE, cells.get(1).get(4).getLifeStatus());
        assertEquals(LifeStatus.ALIVE, cells.get(2).get(3).getLifeStatus());
        assertEquals(LifeStatus.ALIVE, cells.get(2).get(4).getLifeStatus());

        assertEquals(LifeStatus.DEAD, cells.get(1).get(2).getLifeStatus());
        assertEquals(LifeStatus.DEAD, cells.get(1).get(5).getLifeStatus());


    }




}

