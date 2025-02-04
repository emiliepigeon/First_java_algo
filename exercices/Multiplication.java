package exercices;

import java.util.Scanner;

public class Multiplication {
// Script prend le numéro d’une table en entrée, affichez la table complète jusqu’à 10.
    
    public static void afficherTableMultiplication() {
        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre pour voir sa table de multiplication : ");
        
        // Lecture du nombre entré par l'utilisateur
        int nombre;
        try {
            nombre = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            // Si l'utilisateur n'entre pas un nombre valide, on affiche un message d'erreur et on termine la méthode
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            return;
        }
        
        // Affichage de l'en-tête de la table de multiplication
        System.out.println("Table de multiplication de " + nombre + " :");
        
        // Boucle pour calculer et afficher la table de multiplication
        for (int i = 1; i <= 10; i++) {
            // Calcul du résultat de la multiplication
            int resultat = nombre * i;
            
            // Affichage de la ligne de multiplication
            System.out.println(nombre + " x " + i + " = " + resultat);
        }
    }
}

// PSEUDO CODE
    // Début
    //     Lire nombre
    //     Pour i allant de 1 à 10
    //         résultat ← nombre * i
    //         Afficher nombre + " x " + i + " = " + résultat
    //     FinPour
    // Fin

// NOTES ANNEXES
//     Type d'algorithme :
//          C'est un algorithme de génération de séquence, spécifiquement une table de multiplication.
//     Complexité temporelle (Big O) :
//          La complexité de cet algorithme est O(1), ou complexité constante.

// Explications :

//     L'algorithme effectue toujours exactement 10 itérations, quel que soit le nombre entré.
//     Le nombre d'opérations est fixe et ne dépend pas de la valeur d'entrée.

//     Complexité spatiale :
//     La complexité spatiale est également O(1), ou constante.

// Explications +:

//     L'algorithme utilise un nombre fixe de variables (nombre, i, resultat) quelle que soit la valeur d'entrée.
//     Aucune structure de données supplémentaire n'est créée en fonction de l'entrée.

// Caractéristiques importantes :

//     L'algorithme est très simple et direct.
//     Il gère les erreurs d'entrée (si l'utilisateur n'entre pas un nombre valide).
//     La performance de l'algorithme est constante, quelle que soit la valeur du nombre entré.

// En résumé, c'est un algorithme avec une complexité temporelle et spatiale constante O(1). Il est extrêmement efficace pour sa tâche spécifique d'afficher une table de multiplication jusqu'à 10, car son temps d'exécution et son utilisation de mémoire ne dépendent pas de la valeur d'entrée.