package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("E:\\srcJava");
        List<Path> files = new ArrayList<>();

        try(Stream<Path> entries = Files.walk(path).filter(Files::isRegularFile)) {
            entries
                    .filter(entry -> String.valueOf(entry).endsWith(".java"))
                    .forEach((entry)->{
                    // Take all lines in each file
                    try(Stream<String> lines = Files.lines(entry, Charset.forName("UTF-8"))) {
                        // If the keyword is found add the path to the list
                        if (lines.anyMatch(f -> f.contains("transient")
                                || f.contains("volatile")
                                || f.contains("Transient")
                                || f.contains("Volatile")))
                            files.add(entry);
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    });
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(files);
    }
}
