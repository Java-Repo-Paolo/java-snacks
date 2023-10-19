package org.lessons.java;

/*
Snack5
Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
Possibile usare solo :
- cicli
- chartAt
- if / switch
 */

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one number: ");
        String numString = scan.nextLine();
        //String numString = "15";
        int numInt;

        switch (numString) {
            case "uno":
            case "1": {
                numInt = 1;
                break;
            }
            case "due":
            case "2": {
                numInt = 2;
                break;
            }
            case "tre":
            case "3": {
                numInt = 3;
                break;
            }
            case "quattro":
            case "4": {
                numInt = 4;
                break;
            }
            case "cinque":
            case "5": {
                numInt = 5;
                break;
            }
            default:
                numInt = 0;
                break;
        }

        System.out.print("The converted number is: " + numInt);
    }


}
