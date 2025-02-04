package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class SommePairs {
// Script prend une liste en entrée, indiquez la somme des nombres pairs dans la liste.

    
    public static void calculerSommePairs() {
        // Création d'un Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Création d'une liste pour stocker les nombres entrés par l'utilisateur
        ArrayList<Integer> liste = new ArrayList<>();
        
        // Demander à l'utilisateur d'entrer des nombres
        System.out.println("Entrez une série de nombres (entrez 'fin' pour terminer) :");
        
        // Lire les nombres jusqu'à ce que l'utilisateur entre "fin"
        while (true) {
            String input = scanner.nextLine(); // Lire une ligne depuis la console
            
            // Si l'utilisateur entre "fin", on arrête la saisie
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            
            // Essayer de convertir l'entrée en un nombre entier
            try {
                int nombre = Integer.parseInt(input);
                liste.add(nombre); // Ajouter le nombre à la liste
            } catch (NumberFormatException e) {
                // Si l'entrée n'est pas un nombre valide, afficher un message d'erreur
                System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'fin'.");
            }
        }
        
        // Vérifier si la liste est vide
        if (liste.isEmpty()) {
            System.out.println("La liste est vide. Aucune somme à calculer.");
            return; // Quitter la méthode si aucune donnée n'a été entrée
        }
        
        // Initialiser une variable pour stocker la somme des nombres pairs
        int sommePairs = 0;
        
        // Parcourir chaque nombre dans la liste
        for (int nombre : liste) {
            // Vérifier si le nombre est pair (divisible par 2 sans reste)
            if (nombre % 2 == 0) {
                sommePairs += nombre; // Ajouter le nombre pair à la somme
            }
        }
        
        // Afficher le résultat final
        System.out.println("La somme des nombres pairs est : " + sommePairs);
    }
}


// PSEUDO CODE
    // Début
    //     Lire liste
    //     somme_pairs ← 0
    //     Pour chaque nombre dans liste
    //         Si nombre modulo 2 = 0 Alors
    //             somme_pairs ← somme_pairs + nombre
    //         FinSi
    //     FinPour
    //     Afficher "La somme des nombres pairs est : " + somme_pairs
    // Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de parcours et de filtrage qui somme les éléments pairs d'une liste.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     L'algorithme parcourt chaque élément de la liste une seule fois.
//     Pour chaque élément, il effectue une vérification (si le nombre est pair) et potentiellement une addition.
//     Le nombre d'opérations est directement proportionnel au nombre d'éléments dans la liste.

//     Complexité spatiale :
//     La complexité spatiale est O(n), où n est le nombre d'éléments entrés par l'utilisateur.

// Explications +:

//     Une ArrayList est utilisée pour stocker tous les nombres entrés, ce qui contribue à la complexité spatiale O(n).
//     Les autres variables (sommePairs, nombre) utilisent un espace constant.

// En résumé, c'est un algorithme de parcours linéaire avec une complexité temporelle et spatiale de O(n). Il est efficace pour sa tâche spécifique de calculer la somme des nombres pairs dans une liste, et sa performance dépendra du nombre d'éléments dans la liste d'entrée. Note : La partie de saisie des données par l'utilisateur n'est généralement pas incluse dans l'analyse de complexité, car elle dépend de facteurs externes (vitesse de saisie de l'utilisateur). L'analyse se concentre sur le traitement des données une fois qu'elles sont dans la liste.