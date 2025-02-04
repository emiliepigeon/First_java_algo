package exercices;

import java.util.Scanner;

public class Inverse {
    // Script demande une chaine de caractères en entrée et vous l’affichez dans le sens inverse.
        // exemple : hello world = dlrow olleh
    
    public static void inverserChaine() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire la chaîne
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();
        
        // Inverser la chaîne
        String chaineInversee = "";
        for (int i = chaine.length() - 1; i >= 0; i--) {
            chaineInversee += chaine.charAt(i);
        }
        
        // Afficher la chaîne inversée
        System.out.println("La chaîne inversée est : " + chaineInversee);
    }
}

// PSEUDO CODE
    // Début
    // Lire chaine
    // chaine_inversée ← ""
    // Pour chaque caractère dans chaine
    // chaine_inversée ← caractère + chaine_inversée
    // FinPour
    // Afficher chaine_inversée
    // Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de parcours inverse et de construction de chaîne qui inverse l'ordre des caractères d'une chaîne donnée.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est la longueur de la chaîne d'entrée.

// Explications :

//     L'algorithme parcourt chaque caractère de la chaîne une seule fois, de la fin au début.
//     Pour chaque caractère, il effectue une opération de concaténation.
//     Le nombre d'opérations est directement proportionnel à la longueur de la chaîne.

//     Complexité spatiale :
//     La complexité spatiale est également O(n), où n est la longueur de la chaîne d'entrée.

// Explications +:

//     Une nouvelle chaîne (chaineInversee) est créée pour stocker le résultat.
//     Cette nouvelle chaîne aura la même longueur que la chaîne d'entrée.
//     L'espace utilisé croît linéairement avec la taille de l'entrée.

// Note importante sur l'efficacité :
// Bien que la complexité temporelle soit O(n), l'utilisation de la concaténation de chaînes (+=) dans une boucle peut être inefficace pour de très longues chaînes en Java. Pour une implémentation plus efficace, on pourrait utiliser un StringBuilder.