package gameoflife;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/*
utdata kan se ut såhär:
Generation 2:
4 8
........
...**...
...**...
........
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

}
