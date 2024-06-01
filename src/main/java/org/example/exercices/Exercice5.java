package org.example.exercices;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        // Etape 1 recupere le nombre de copie à faire
        // Variables
        int nbCopie;
        double prixAPayer;
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de photocopies :");
        nbCopie = scanner.nextInt();

        // Concatenation
        System.out.println("Vous avez demandé "+nbCopie+" photocopies.");


        // si nb copie < 10
        if (nbCopie < 10){
            prixAPayer = 0.5 * nbCopie;
        }else {
            if (nbCopie <= 20){
                prixAPayer = 0.4 * nbCopie;
            }else {
                prixAPayer = 0.3 * nbCopie;
            }
        }


        System.out.println("Pour "+nbCopie+" le montant à paye est de : "+prixAPayer);

        System.out.println();

        if (nbCopie < 10){
            prixAPayer = 0.5 * nbCopie;
        } else if (nbCopie <=20) {
            prixAPayer = 0.4 * nbCopie;
        }else if(nbCopie > 20){
            prixAPayer = 0.3 * nbCopie;
        }

        System.out.println("Pour "+nbCopie+" le montant à paye est de : "+prixAPayer);
    }
}
