package exercices;

import java.util.Scanner;

public class Voyelles {
// Script demande un mot a l’utilisateur en entrée, indiquez le nombre de voyelle que le mot contient.

    public static void compterVoyelles() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le mot
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().toLowerCase();
        
        String voyelles = "aeiouy";
        int compteurVoyelles = 0;
        
        // Compter les voyelles
        for (char lettre : mot.toCharArray()) {
            if (voyelles.indexOf(lettre) != -1) {
                compteurVoyelles++;
            }
        }
        
        // Afficher le résultat
        System.out.println("Nombre de voyelles : " + compteurVoyelles);
    }
}

// PSEUDO CODE
    // Début
    //     Lire mot
    //     voyelles ← "aeiouy"
    //     compteur_voyelles ← 0
    //     Pour chaque lettre dans mot
    //         Si lettre est dans voyelles Alors
    //             compteur_voyelles ← compteur_voyelles + 1
    //         FinSi
    //     FinPour
    //     Afficher "Nombre de voyelles : " + compteur_voyelles
    // Fin


// NOTES ANNEXES
//     Type d'algorithme :
//           C'est un algorithme de parcours linéaire qui compte les occurrences de certains caractères (voyelles) dans une chaîne de caractères.
//     Complexité temporelle (Big O) :
//          La complexité de cet algorithme est O(n), où n est la longueur du mot entré.

// Explications :

//     L'algorithme parcourt chaque caractère du mot une seule fois.
//     Pour chaque caractère, il effectue une vérification (si c'est une voyelle).
//     Le nombre d'opérations est directement proportionnel à la longueur du mot.

//     Complexité spatiale :
//     La complexité spatiale est O(n), où n est la longueur du mot.

// Explications +:

//     La méthode toCharArray() crée un nouveau tableau de caractères de la même longueur que le mot, ce qui contribue à la complexité spatiale O(n).
//     Les autres variables (voyelles, compteurVoyelles) utilisent un espace constant.
