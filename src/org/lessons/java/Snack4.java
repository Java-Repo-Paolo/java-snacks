package org.lessons.java;

/*
Snack4
Data in input una stringa verificare se è palindroma
*/

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First word: ");
        String firstWord = scan.nextLine();
        //System.out.println("You wrote " + word.toUpperCase());

        String word = firstWord.toLowerCase();

        char[] invertedChars = new char[word.length()];
        for (int i = word.length() - 1, j = 0; i >= 0 && j < word.length(); i--, j++) {
            invertedChars[j] = word.charAt(i);
        }
        String invertedWord = String.valueOf(invertedChars);

        //System.out.print("The reversed word is: " + invertedWord);

        if (invertedWord.equals(word)){
            System.out.print("\nThe word is palindrome");
        }else {
            System.out.print("\nThe word " + firstWord +  " is not a palindrome");
        }

        scan.close();
    }
}
