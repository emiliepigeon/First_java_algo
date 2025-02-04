package exercices;

import java.util.Scanner;

public class PrixTva {
// Script prend en entrée un prix HT, indiquez le montant de la TVA 5%
    
    public static void calculerTVA() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le prix HT
        System.out.print("Entrez le prix HT : ");
        double prixHT = Double.parseDouble(scanner.nextLine());
        
        // Calculer la TVA
        double TVA = prixHT * 0.05;
        
        // Afficher le résultat
        System.out.printf("Le montant de la TVA est : %.2f€%n", TVA);
    }
}

// PSEUDO CODE0

    // Début
    //     Lire prix_HT
    //     TVA ← prix_HT * 0.05
    //     Afficher "Le montant de la TVA est : " + TVA
    // Fin


// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de calcul simple qui effectue une opération arithmétique de base (multiplication).
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée :
//         Une lecture d'entrée utilisateur
//         Une multiplication
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur du prix HT entré.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si le prix HT devient très grand.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (prixHT, TVA), indépendamment de la valeur de l'entrée.

// Caractéristiques importantes :

//     L'algorithme est très simple et direct.
//     Il utilise un taux de TVA fixe de 5%.
//     L'utilisation de double permet de gérer des prix avec des décimales.
//     Le résultat est formaté pour afficher deux décimales.

// En résumé, c'est un algorithme simple et efficace avec une complexité constante en temps et en espace, ce qui le rend très performant pour sa tâche spécifique de calcul de TVA. Sa performance reste la même quelle que soit la valeur du prix HT entré.