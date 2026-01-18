package com.yetnt;

import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Word> words = ReadFileFromResources.getWords();

        String num = JOptionPane.showInputDialog("Amount of attempts");
        int num2;
        try {
            num2 = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            num2 = 1;
        }

        for (int i = 0; i < num2; i++) {
            // pick random word

            Word randomWord = words.get((int) (Math.random() * words.size()));

            String ans = JOptionPane.showInputDialog("What is the English translation of: " + randomWord.getAfrikaans() + "?");

            if (ans.toLowerCase().equals(randomWord.getEnglish())) {
                JOptionPane.showMessageDialog(null, "Correct!");
                ReadFileFromResources.printAttempt(new Attempt(randomWord.getAfrikaans(), String.valueOf(System.currentTimeMillis()), true));
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is: " + randomWord.getEnglish());
                ReadFileFromResources.printAttempt(new Attempt(randomWord.getAfrikaans(), String.valueOf(System.currentTimeMillis()), false));
            }
        }

    }
}