package gameoflife;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CellGeneration {

    public static String readFirstGeneration() throws FileNotFoundException {
        File file = new File("src/main/resources/first-generation");
        Scanner sc = new Scanner(file);

        return sc.useDelimiter("\\Z").next();
    }

    public void getToNextGeneration(Cell cell) {
        //TODO: skapa levande cell then(testa använda cell.getNextCellState)
    }

}
