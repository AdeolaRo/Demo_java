package org.example.exercices;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre taille en cm :");
        int taille = scanner.nextInt();

        System.out.println("Entrez votre poids : ");
        int poids = scanner.nextInt();

        if (taille >=145 && taille <= 169 && poids >=43 && poids<=47){
            // System.out.println("Votre vêtement se trouve dans la section 1");
        }
        else if (taille >=145 && taille <= 166 && poids >=48 && poids<=53){
           // System.out.println("Votre vêtement se trouve dans la section 1");
        }
        else if (taille >=145 && taille <= 163 && poids >=54 && poids<=59) {
            // System.out.println("Votre vêtement se trouve dans la section 1");
        }
        else if (taille >=145 && taille <= 160 && poids >=60 && poids<=65) {
            System.out.println("Votre vêtement se trouve dans la section 1");
        }
// Deuxième option

        else if (taille >=169 && taille <= 178 && poids >=48 && poids<=53){
            //System.out.println("Votre vêtement se trouve dans la section 2");
        }
        else if (taille >=166 && taille <= 175 && poids >=54 && poids<=59){
           // System.out.println("Votre vêtement se trouve dans la section 2");
        }
        else if (taille >=163 && taille <= 172 && poids >=60 && poids<=65) {
           // System.out.println("Votre vêtement se trouve dans la section 2");
        }
        else if (taille >=160 && taille <= 169 && poids >=66 && poids<=71) {
            System.out.println("Votre vêtement se trouve dans la section 2");
        }
// Troisième option

        else if (taille >=178 && taille <= 183 && poids >=54 && poids<=59){
           // System.out.println("Votre vêtement se trouve dans la section 3");
        }
        else if (taille >=175 && taille <= 183 && poids >=60 && poids<=65){
            //System.out.println("Votre vêtement se trouve dans la section 3");
        }
        else if (taille >=172 && taille <= 183 && poids >=66 && poids<=71) {
            //System.out.println("Votre vêtement se trouve dans la section 3");
        }
        else if (taille >=163 && taille <= 183 && poids >=72 && poids<=77) {
            System.out.println("Votre vêtement se trouve dans la section 3");
        }else
        {
            System.out.println("Nous n'avons pas de sections réservé à ces mesures. Désolé ! ");
        }

    }

}
