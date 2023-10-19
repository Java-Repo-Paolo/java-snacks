package org.lessons.java;
/*
Snack1
Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
Se il numero è negativo termina.
 */

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Insert one number: ");
            int number = scan.nextInt();
            if  (number < 0) {
                System.out.println("You entered a negative number. The program ends.");
                break;
            }
            else if (number % 2 == 0){
                System.out.println("the number is: " + number);
            }
            else {
                System.out.println("the number is: " + (number + 1));
            }

        }

    }
}
