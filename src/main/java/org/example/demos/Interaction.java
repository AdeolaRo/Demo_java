package org.example.demos;

public class Interaction {
    public static void main(String[] args) {
        // les differents print ( println, print, printf )

        // snippet sout
        System.out.println("Bonjour");
        System.out.println("à tous !!");
        System.out.println();
        System.out.println("##################");
        System.out.println();
        System.out.print("Bonjour");
        System.out.print(" à tous !!");

        int age = 25;
        double poids = 70;
        String nom = "John Doe";

        System.out.printf("\nNom : %s, Age: %d, Poids : %.2f kg",nom,age,poids);
    }
}
