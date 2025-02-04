package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusGrand {
// Script prend une liste en entrée, indiquez le plus grand élément de la liste.
    
    public static void trouverPlusGrand() {
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
        
        // Trouver le plus grand élément
        int plusGrand = liste.get(0);
        for (int nombre : liste) {
            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
        }
        
        // Afficher le résultat
        System.out.println("Le plus grand élément est : " + plusGrand);
    }
}

// PSEUDO CODE
    // Début
    //     Lire liste
    //     plus_grand ← premier élément de liste
    //     Pour chaque nombre dans liste
    //         Si nombre > plus_grand Alors
    //             plus_grand ← nombre
    //         FinSi
    //     FinPour
    //     Afficher "Le plus grand élément est : " + plus_grand
    // Fin


// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de recherche linéaire pour trouver le maximum dans une liste.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     La boucle de saisie des données prend O(n) temps.
//     Le parcours de la liste pour trouver le plus grand élément prend également O(n) temps.
//     Donc, la complexité totale est O(n + n) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n).

// Explications +:

//     L'ArrayList stocke tous les nombres entrés : O(n)
//     Les autres variables (plusGrand, nombre) utilisent un espace constant.

// Caractéristiques importantes :

//     L'algorithme parcourt la liste une seule fois pour trouver le plus grand élément.
//     Il gère correctement les entrées invalides et les listes vides.
//     Il initialise le plus grand élément avec le premier élément de la liste, ce qui est une approche efficace.

// En résumé, c'est un algorithme simple et efficace pour trouver le plus grand élément dans une liste, avec une complexité temporelle et spatiale linéaire O(n). Il est adapté pour des listes de toutes tailles et offre une bonne performance pour cette tâche spécifique.