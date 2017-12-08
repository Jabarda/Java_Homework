package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(".\\file.txt");
        char character;
        int counter = 0;

        System.out.println("Character");
        character = scanner.next().charAt(0);

        try(Stream<String> lines = Files.lines(path)) {
            // Replace every line with the number of character occurrences and then sum them
            counter = lines
                .map(line ->  line.length() - line.replace(Character.toString(character), "").length())
                .reduce(0, (a, b) -> a + b);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
    }
}
