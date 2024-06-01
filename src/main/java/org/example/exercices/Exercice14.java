package org.example.exercices;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre !");
        int nb = 0;
        int sum =0;

        nb = scanner.nextInt();
/*
         for(int i =0;i <=nb;i++ ){
             sum = sum +i;
             System.out.println(sum);
         }
         */
// TODO faire afficher les additions

           for ( int i = 1; i < nb ; i++) {
            System.out.print(i+" + ");
            sum += i;
        }
        System.out.println(nb+ " = " +(sum+nb));


    }
}
