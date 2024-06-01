package org.example.demos;

public class Operateurs {
    public static void main(String[] args) {
        // région opérateur arithmétiques
        int result = 1 + 2;

        System.out.println("1 + 2 = "+result); // 1 + 2 = 3
        int originalResult = result;

        result = result - 1;
        System.out.println(originalResult+" - 1 = "+result); // 3 - 1 = 2
        originalResult = result;

        result = result * 2;
        System.out.println(originalResult+" * 2 = "+result); // 2 * 2 = 4
        originalResult = result;

        result = result / 2;
        System.out.println(originalResult+" / 2 = "+result); // 4 / 2 = 2
        originalResult = result;

        // TODO terminer la demo

        result = result + 8;

        System.out.println(originalResult+" + 8 = "+result); // 2 + 8 = 10
        originalResult = result;

        result = result % 7;

        System.out.println(originalResult+" modulo 7 "+result); // 10 % 7 = 3

        // région opérateur unaires

        int nombre = +1;

        System.out.println(nombre); // 1

        // Opérateur de décrementation
        nombre--;

        System.out.println(nombre); // 0

        // Operateur d'incrementation

        nombre++;

        System.out.println(nombre); // 1



         nombre -= 2; // nombre = nombre - 2;

        nombre += 10;

        // operateur de négation unaire

        nombre = -nombre;

        System.out.println(nombre);

        // opérateur not
        boolean success = false;

        System.out.println(success); // false
        System.out.println(!success); // true

        // région affectation composées

        int x = 5;

        // incrémentation
        x  += 5; // x = x +5

        // decrementation

        x -= 3; // x = x - 3

        // Operateur d'egalite relationnels

        int value1 = 1;
        int value2 = 2;
        boolean resultat;

        resultat =  value1 == value2;
        System.out.println(resultat); // false

        resultat = value1 != value2;
        System.out.println(resultat); // true

        resultat = value1 > value2;
        System.out.println(resultat); // false

        // ET : les deux conditions doivent etre vrai
        resultat = (value1 == 1) && (value2 == 2);
        System.out.println(resultat); // true

        // OU : l'une ou l'autre des conditions
        resultat = (value1 == 1) || (value2 == 2);
        System.out.println(resultat); // true


    }
}
