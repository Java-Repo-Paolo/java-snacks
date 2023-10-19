package org.lessons.java;

/*
Snack3
Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari;
 */

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int sumPosOdd = 0;

        System.out.println("The numbers in odd position are: ");
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
            //  System.out.print(i + " ");
            if (i % 2 != 0){
                System.out.print(numbers[i] + " ");
                sumPosOdd += numbers[i];
            }
        }
        System.out.println("\nThe sum of the numbers in odd position is: " + sumPosOdd);
    }
}
