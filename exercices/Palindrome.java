package exercices;

import java.util.Scanner;

public class Palindrome {
// Script demande un mot en entrée, indiquez si le mot est un palindrome ou non.
    
    public static void verifierPalindrome() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le mot
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().toLowerCase();
        
        // Inverser le mot
        String motInverse = "";
        for (int i = mot.length() - 1; i >= 0; i--) {
            motInverse += mot.charAt(i);
        }
        
        // Vérifier si c'est un palindrome
        if (mot.equals(motInverse)) {
            System.out.println("C'est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }
    }
}

// PSEUDO CODE
        // Début
        //     Lire mot
        //     mot_inversé ← ""
        //     Pour chaque caractère dans mot
        //         mot_inversé ← caractère + mot_inversé
        //     FinPour
        //     Si mot = mot_inversé Alors
        //         Afficher "C'est un palindrome"
        //     Sinon
        //         Afficher "Ce n'est pas un palindrome"
        //     FinSi
        // Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de comparaison de chaînes qui utilise l'inversion de chaîne pour vérifier si un mot est un palindrome.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est la longueur du mot.

// Explications :

//     La boucle pour inverser le mot parcourt chaque caractère une fois : O(n)
//     La comparaison des chaînes (mot.equals(motInverse)) prend également O(n) dans le pire cas.
//     Donc, la complexité totale est O(n + n) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n).

// Explications +:

//     Une nouvelle chaîne (motInverse) est créée pour stocker le mot inversé, ce qui nécessite O(n) espace.
//     Les autres variables (mot) utilisent également O(n) espace.

// Caractéristiques importantes :

//     L'algorithme convertit le mot en minuscules pour ignorer la casse.
//     Il utilise une approche simple d'inversion de chaîne pour vérifier le palindrome.
//     La comparaison finale est effectuée en une seule opération grâce à la méthode equals().

// En résumé, c'est un algorithme simple pour vérifier si un mot est un palindrome, avec une complexité temporelle et spatiale linéaire O(n). Bien qu'il soit efficace pour des mots courts à moyens, il pourrait être optimisé pour réduire l'utilisation de la mémoire en évitant la création d'une chaîne inversée complète.