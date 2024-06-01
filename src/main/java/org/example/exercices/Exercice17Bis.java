package org.example.exercices;

import java.util.Scanner;

public class Exercice17Bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Veuillez saisir un nombre ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
            }

    }
}



