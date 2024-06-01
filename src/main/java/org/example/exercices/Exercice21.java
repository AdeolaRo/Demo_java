package org.example.exercices;

import java.util.Scanner;

public class Exercice21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] tabl = new int[15][3];

        for(int i =0; i<15;i++){
            for (int j=0; j<3;j++){
                System.out.println("Entrez la note de l'étudiant, "+(i+1)+" dans la matière "+(j+1));
                tabl[i][j] = scanner.nextInt();

            }
        }

    }
}
