package org.lessons.java;

/*
Snack2
Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
 */

import java.util.Random;
import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Helen", "Isaac", "Julia"};
        String[] surnames = {"Smith", "Johnson", "Williams", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson"};

        Scanner scanner = new Scanner(System.in);

        Random randomGenerator = new Random();

        // Numero di invitati casuali da generare
        int casualList = 20;

        for (int i = 1; i <= casualList; i++){

            //Prendi random dall'array un nome con interi
            int casualNameInt = randomGenerator.nextInt(names.length);
            int casualSurnameInt = randomGenerator.nextInt(surnames.length);

            //Conversione degli interi in stringhe
            String casualName = names[casualNameInt];
            String casualSurname= surnames[casualSurnameInt];

            System.out.println(i + "." + casualName + " " + casualSurname);
        }




    }
}
