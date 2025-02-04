package exercices;

import java.util.Scanner;

public class Fibonacci {
// Script qui calcule jusqu’à un nombre donner le suite de Fibonacci.
    
    public static void afficherSuiteFibonacci() {
        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer le nombre de termes
        System.out.print("Combien de nombres de la suite de Fibonacci souhaitez-vous afficher ?");
        
        // Lecture du nombre de termes
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("Veuillez entrer un nombre non négatif.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier non négatif.");
            return;
        }
        
        // Traitement des cas particuliers
        if (n == 0) {
            System.out.println("Suite de Fibonacci : ");
            return;
        } else if (n == 1) {
            System.out.println("Suite de Fibonacci : 0");
            return;
        }
        
        // Initialisation des premiers termes
        long f0 = 0, f1 = 1;
        
        System.out.print("Suite de Fibonacci : " + f0 + ", " + f1);
        
        // Calcul et affichage des termes suivants
        for (int i = 2; i < n; i++) {
            long fn = f0 + f1;
            System.out.print(", " + fn);
            f0 = f1;
            f1 = fn;
        }
        System.out.println();
    }
}

// PSEUDO CODE
    // Début
    //     Lire n
    //     Si n = 0 Alors
    //         Afficher 0
    //     Sinon Si n = 1 Alors
    //         Afficher 0, 1
    //         Sinon
    //             f0 ← 0
    //             f1 ← 1
    //         Afficher f0, f1
    //             Pour i allant de 2 à n - 1
    //                 fn ← f0 + f1
    //                 Afficher fn
    //                 f0 ← f1
    //                 f1 ← fn
    //             FinPour
    //     FinSi
    // Fin


// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme itératif qui génère la suite de Fibonacci jusqu'à un nombre donné de termes.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre de termes de la suite de Fibonacci à générer.

// Explications :

//     La boucle principale s'exécute (n-2) fois, car les deux premiers termes sont traités séparément.
//     Chaque itération de la boucle effectue un nombre constant d'opérations (addition et affectations).
//     Donc, la complexité totale est O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(1), constante.

// Explications +:

//     L'algorithme utilise un nombre fixe de variables (f0, f1, fn) quel que soit le nombre de termes à générer.
//     Il n'y a pas de structure de données supplémentaire qui grandit avec n.

// Caractéristiques importantes :

//     L'algorithme gère correctement les cas particuliers (n = 0 et n = 1).
//     Il utilise des variables de type long pour gérer de plus grands nombres dans la suite.
//     L'affichage se fait au fur et à mesure de la génération, évitant ainsi de stocker toute la suite en mémoire.

// En résumé, c'est un algorithme efficace pour générer la suite de Fibonacci, avec une complexité temporelle linéaire O(n) et une complexité spatiale constante O(1). Il est bien adapté pour générer un grand nombre de termes de la suite sans consommer beaucoup de mémoire.