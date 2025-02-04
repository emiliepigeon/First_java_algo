package exercices;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Doublons {
// Élimination des doublons dans une liste :
// Ecrire un script qui supprime tous les doublons dans une liste, attention
// l’ordre doit rester le même

        public static void supprimerDoublons() {
        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Création de la liste initiale
        List<Integer> liste = new ArrayList<>();
        
        // Demande à l'utilisateur d'entrer les nombres
        System.out.println("Entrez les nombres de la liste (entrez 'fin' pour terminer) :");
        
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
        
        // Utilisation d'un LinkedHashSet pour supprimer les doublons tout en préservant l'ordre
        LinkedHashSet<Integer> ensembleSansDoublons = new LinkedHashSet<>(liste);
        
        // Conversion du LinkedHashSet en List pour l'affichage
        List<Integer> listeSansDoublons = new ArrayList<>(ensembleSansDoublons);
        
        // Affichage des résultats
        System.out.println("Liste originale : " + liste);
        System.out.println("Liste sans doublons : " + listeSansDoublons);
        }
}


// PSEUDO CODE
        // Début
        //     liste ← [1, 2, 3, 1, 2, 4, 5, 3, 6]  // Exemple de liste avec des doublons
        //     nouvelle_liste ← []

        //     Pour chaque élément dans liste
        //         Si élément n'est pas dans nouvelle_liste Alors
        //             Ajouter élément à nouvelle_liste
        //         FinSi
        //     FinPour

        //     Afficher "Liste sans doublons :", nouvelle_liste
        // Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de suppression de doublons qui préserve l'ordre original des éléments.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     La création du LinkedHashSet à partir de la liste initiale prend O(n) temps.
//     La conversion du LinkedHashSet en ArrayList prend également O(n) temps.
//     Toutes les autres opérations (saisie des données, affichage) sont négligeables en comparaison.

//     Complexité spatiale :
//     La complexité spatiale est O(n), où n est le nombre d'éléments uniques dans la liste.

// Explications +:

//     Une ArrayList initiale est utilisée pour stocker tous les nombres entrés : O(n)
//     Un LinkedHashSet est créé pour stocker les éléments uniques : O(n) dans le pire cas (tous les éléments sont uniques)
//     Une nouvelle ArrayList est créée à partir du LinkedHashSet : O(n)

// Caractéristiques importantes :

//     L'utilisation d'un LinkedHashSet est cruciale ici car il permet de supprimer les doublons tout en préservant l'ordre d'insertion des éléments.
//     Cette approche est efficace car elle effectue la suppression des doublons en un seul passage sur les données.

// En résumé, c'est un algorithme efficace pour supprimer les doublons tout en préservant l'ordre, avec une complexité temporelle et spatiale linéaire O(n). Il offre un bon équilibre entre performance et préservation de l'ordre original des éléments.