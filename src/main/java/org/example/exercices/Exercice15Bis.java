package org.example.exercices;

public class Exercice15Bis {
    public static void main(String[] args) {

        double accroiParAn, taux, popI, popF;

        popI = 96809;
        taux = 0.89 / 100;
        popF = 0;

        for (int i = 1; popF < 120000; i++) {
            popF = i * (popI * taux) + popI;

            System.out.println(i);
        }

    }


}

