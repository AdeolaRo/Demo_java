package org.example.demos;

public class Variables {
    public static void main(String[] args) {
        // Déclaration d'une variable

        /*
        Ecrire des
        commentaires
        sur plusieurs lignes
         */

        // syntaxe
        // <type> <nom>;

        // int entier sur 32 bits
        int age;

        // long entier sur 64 bits
        long indice;

        float distance;

        double monnaie;

        boolean estVrai;

        char lettre;

        // chaine de caractere
        // String n'est pas considere comme un type primitif
        String prenom;

        // <type> <nom> = <valeur>;
        int jour = 5;

        // Affectation
        age = 35;
        indice = 100_000_000;
        distance = 12.74f;
        monnaie = 15.5;
        estVrai = false;
        lettre = 'a';
        prenom = "toto";

        // permet d'afficher les enregistrement dans la console
        System.out.println(distance);

    }
}
