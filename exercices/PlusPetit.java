package exercices;

import java.util.ArrayList;
import java.util.Scanner;
// Script prend une liste en entrée, indiquez le plus petit élément de la liste
public class PlusPetit {
    
    public static void trouverPlusPetit() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();
        
        // Lire la liste de nombres
        System.out.println("Entrez une série de nombres: (entre chaque nombre touche entrez et entrer 'fin' pour terminer) :");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int nombre = Integer.parseInt(input);
                liste.add(nombre);
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'fin'.");
            }
        }
        
        if (liste.isEmpty()) {
            System.out.println("La liste est vide.");
            return;
        }
        
        // Trouver le plus petit élément
        int plusPetit = liste.get(0);
        for (int nombre : liste) {
            if (nombre < plusPetit) {
                plusPetit = nombre;
            }
        }
        
        // Afficher le résultat
        System.out.println("Le plus petit élément est : " + plusPetit);
    }
}

// PSEUDO CODE
    // Début
    //     Lire liste
    //     plus_petit ← premier élément de liste
    //     Pour chaque nombre dans liste
    //         Si nombre < plus_petit Alors
    //             plus_petit ← nombre
    //         FinSi
    //     FinPour
    //     Afficher "Le plus petit élément est : " + plus_petit
    // Fin


// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de recherche linéaire pour trouver le minimum dans une liste.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     La boucle de saisie des données prend O(n) temps.
//     Le parcours de la liste pour trouver le plus petit élément prend également O(n) temps.
//     Donc, la complexité totale est O(n + n) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n).

// Explications +:

//     L'ArrayList stocke tous les nombres entrés : O(n)
//     Les autres variables (plusPetit, nombre) utilisent un espace constant.

// Caractéristiques importantes :

//     L'algorithme parcourt la liste une seule fois pour trouver le plus petit élément.
//     Il gère correctement les entrées invalides et les listes vides.
//     Il initialise le plus petit élément avec le premier élément de la liste, ce qui est une approche efficace.

// En résumé, c'est un algorithme simple et efficace pour trouver le plus petit élément dans une liste, avec une complexité temporelle et spatiale linéaire O(n). Il est adapté pour des listes de toutes tailles et offre une bonne performance pour cette tâche spécifique.