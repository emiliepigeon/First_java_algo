package exercices;

import java.util.Scanner;

public class PrixHt {
// Script prend un prix TTC en entrée, indiquez le prix HT du produit. TVA 20%

    public static void calculerPrixHT() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le prix TTC
        System.out.print("Entrez le prix TTC : ");
        double prixTTC = Double.parseDouble(scanner.nextLine());
        
        // Calculer le prix HT
        double prixHT = prixTTC / 1.20;
        
        // Afficher le résultat
        System.out.printf("Le prix HT est : %.2f€%n", prixHT);
    }

}


// PSEUDO CODE
    // Début
    //     Lire prix_TTC
    //     prix_HT ← prix_TTC / 1.20
    //     Afficher "Le prix HT est : " + prix_HT
    // Fin


// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de calcul simple qui effectue une opération arithmétique de base (division).
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée :
//         Une lecture d'entrée utilisateur
//         Une division
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur du prix TTC entré.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si le prix TTC devient très grand.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (prixTTC, prixHT), indépendamment de la valeur de l'entrée.

// Caractéristiques importantes :

//     L'algorithme est très simple et direct.
//     Il utilise un taux de TVA fixe de 20% (d'où la division par 1.20).
//     L'utilisation de double permet de gérer des prix avec des décimales.
//     Le résultat est formaté pour afficher deux décimales.

// En résumé, c'est un algorithme simple et efficace avec une complexité constante en temps et en espace, ce qui le rend très performant pour sa tâche spécifique de calcul du prix HT à partir du prix TTC. Sa performance reste la même quelle que soit la valeur du prix TTC entré.