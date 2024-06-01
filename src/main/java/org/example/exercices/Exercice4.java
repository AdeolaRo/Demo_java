package org.example.exercices;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        int nbr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entier : ");
        nbr = scanner.nextInt();
        if(nbr % 3 == 0){
           // System.out.println("Votre nombre est divisible par 3");
            System.out.println(nbr+" est divisible par 3");
        }else {
           // System.out.println("Votre nombre n'est pas divisible par 3");
            System.out.println(nbr+" n'est pas divisible par 3");
        }
    }
}
