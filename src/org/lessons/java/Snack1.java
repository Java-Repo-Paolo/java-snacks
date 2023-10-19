package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Insert one number: ");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println("the number is: " + number);
            }else {
                System.out.println("the number is: " + (number + 1));
            }
        }

    }
}
