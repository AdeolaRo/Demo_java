package org.example.exercices;

import java.util.Scanner;

public class Exercice15 {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int nbr = scanner.nextInt();*/

        for (int i = 1; i <= 12; i++) {

            for (int j = 1; j <= 10; j++) {
                int mult = i * j;

                System.out.println(i + " x " + j + " = " + mult);
            }
        }


    }
}
