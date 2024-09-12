import gameoflife.Board;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Board board = new Board("src/main/resources/board.txt");

        board.printBoard();

    }


}
