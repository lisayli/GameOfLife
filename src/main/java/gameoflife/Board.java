package gameoflife;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/*
utdata kan se ut såhär:
Generation 2:
......
...**.
...**.
......
 */
public class Board {

    private List<List<Cell>> board;

    public Board(String filePath) throws IOException {
        board = Files.lines(Paths.get(filePath))
                .map(this::parseLine)
                .collect(Collectors.toList());
    }

    private List<Cell> parseLine(String line) {
        return line.chars()
                .mapToObj(c -> c == '*' ? new Cell(LifeStatus.ALIVE) : new Cell(LifeStatus.DEAD))
                .collect(Collectors.toList());
    }

    public void printBoard() {
        board.forEach(row -> {
            row.forEach(cell -> System.out.print(cell.toString()));
            System.out.println();
        });
    }

    public List<List<Cell>> getBoard() {
        return board;
    }


    public int countAliveNeighbours(int row, int col) {
        int aliveNeighbours = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;

                int neighbourRow = row + i;
                int neighbourCol = col + j;

                if (neighbourRow >= 0 && neighbourRow < board.size() &&
                        neighbourCol >= 0 && neighbourCol < board.get(0).size()) {
                    if (board.get(neighbourRow).get(neighbourCol).getLifeStatus() == LifeStatus.ALIVE) {
                        aliveNeighbours++;
                    }
                }
            }
        }
        return aliveNeighbours;
    }

}



