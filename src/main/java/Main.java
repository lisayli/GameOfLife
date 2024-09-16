import gameoflife.Board;
import gameoflife.Cell;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Board board = new Board("src/main/resources/board1.txt");

        System.out.println("Generation 1:");
        board.printBoard();

        board.getNextGeneration();

        System.out.println("Generation 2:");
        board.printBoard();

    }

}
