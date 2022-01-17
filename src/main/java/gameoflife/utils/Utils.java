package gameoflife.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Utils {


    public static void firstGeneration(List<String> stringList) throws IOException {
        stringList = readMainGenerationFromFileToArrayList();
        Collections.shuffle(stringList);
        splitList(stringList);
    }


    private static String splitList(List<String> stringList) throws IOException {
        String str;
        for (String line : stringList)
            if (!line.isEmpty()){
                System.out.println(Arrays.toString(line.split(",")));
            }


        return "Something is wrong :))";
    }
    private static List<String> readMainGenerationFromFileToArrayList() throws IOException {
        String fileName = "src/main/resources/first-generation";
        return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
    }





}


