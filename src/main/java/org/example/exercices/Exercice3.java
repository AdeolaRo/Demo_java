package org.example.exercices;

public class Exercice3 {
    public static void main(String[] args) {
        int a,b,c;
        a = 51;
        b = 26;
        System.out.println("Valeur de a au depart  :");
        System.out.println(a);
        System.out.println("Valeur de b au depart : ");
        System.out.println(b);

        c = a;
        a = b;
        b = c;

        System.out.println("Valeur de a la fin  :");
        System.out.println(a);
        System.out.println("Valeur de b a la fin : ");
        System.out.println(b);

    }
}
