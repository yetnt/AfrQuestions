package com.yetnt;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadFileFromResources {

    public static Path wordsFile = Path.of("words.csv");
    public static Path attemptsFile = Path.of("attempts.csv");

    public static ArrayList<Word> getWords() {
        ArrayList<Word> words = new ArrayList<>();

        try {
            Path filePath = Path.of(
                    ReadFileFromResources.class.getClassLoader().getResource(wordsFile.toString()).toURI()
            );

            List<String> lines = Files.readAllLines(filePath);

            for (int i = 1; i < lines.size(); i++) { // Start from 1 to skip header
                String line = lines.get(i);
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    words.add(new Word(parts[0], parts[1]));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return words;
    }

    public static void printAttempt(Attempt attempt) {
        String line = attempt.toCsvLine();
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\ACER\\Documents\\code\\AfrQuestions\\src\\main\\resources\\attempts.csv", true));
            pw.println(line);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
