package com.sirma.javacourse.intro;

import java.util.Scanner;

public class HangmanGame {
    static String hiddenWord = "sabsdssss25s";
    //static String hiddenWord = RandomStrings.randomString(10);

    public static void Play() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder guessedWord = new StringBuilder(hiddenWord.length());
        for (int i = 0; i < hiddenWord.length(); i++) {
            guessedWord.append('*');
        }
        int mistakes = 0;
        do {
            System.out.println("Please enter one letter:");
            char guess = scanner.next().charAt(0);
            System.out.println("Entered " + guess);
            if (hiddenWord.indexOf(guess) == -1) {
                mistakes++;
                System.out.println(guessedWord);
                continue;
            }
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == guess) {
                    guessedWord.replace(i, i + 1, Character.toString(guess));
                }
            }
            System.out.println(guessedWord);
        } while (guessedWord.indexOf("*") != -1);
        System.out.println("You won with " + mistakes + " mistakes");
    }
}
