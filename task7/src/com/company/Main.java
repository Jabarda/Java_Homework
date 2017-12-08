package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        final int AVGLineLength = 5;
        Path FilePath = Paths.get(args[0]);
        int repetitions = Integer.parseInt(args[1]);

        File file = FilePath.toFile();
        List<String> FileLines = new ArrayList<>((int)(file.length() / AVGLineLength));
        long lineCount;

        try(Stream<String> lines = Files.lines(FilePath)) {
            lines.forEach(line -> FileLines.add(line));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        lineCount = FileLines.size();

        Random random = new Random();
        for (int i = 0; i < repetitions; i++) {
            System.out.println((i+1) + ". " + FileLines.get(random.nextInt(Math.toIntExact(lineCount) - 1)));
        }
    }
}
