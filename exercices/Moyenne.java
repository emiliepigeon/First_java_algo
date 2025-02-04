package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Moyenne {
// Script prend une liste de notes en entrée, indiquez la moyenne de la liste.  

    public static void calculerMoyenne() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listeDeNotes = new ArrayList<>();
        
        // Lire la liste de notes
        System.out.println("Entrez les notes (entrez 'fin' pour terminer) :");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                double note = Double.parseDouble(input);
                listeDeNotes.add(note);
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'fin'.");
            }
        }
        
        if (listeDeNotes.isEmpty()) {
            System.out.println("Aucune note n'a été entrée.");
            return;
        }
        
        // Calculer la somme
        double somme = 0;
        for (double note : listeDeNotes) {
            somme += note;
        }
        
        // Calculer la moyenne
        double moyenne = somme / listeDeNotes.size();
        
        // Afficher le résultat
        System.out.printf("La moyenne est : %.2f%n", moyenne);
    }
}


    // Début
    //     Lire liste_de_notes
    //     somme ← 0
    //     Pour chaque note dans liste_de_notes
    //         somme ← somme + note
    //     FinPour
    //     moyenne ← somme / nombre d'éléments dans liste_de_notes
    //     Afficher "La moyenne est : " + moyenne
    // Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de calcul de moyenne qui implique un parcours linéaire d'une liste pour calculer la somme, suivi d'une division.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre de notes dans la liste.

// Explications :

//     L'algorithme parcourt chaque élément de la liste une seule fois pour calculer la somme.
//     Le nombre d'opérations est directement proportionnel au nombre de notes dans la liste.
//     La division finale pour calculer la moyenne est une opération constante.

//     Complexité spatiale :
//     La complexité spatiale est O(n), où n est le nombre de notes entrées.

// Explications +:

//     Une ArrayList est utilisée pour stocker toutes les notes entrées, ce qui contribue à la complexité spatiale O(n).
//     Les autres variables (somme, moyenne) utilisent un espace constant.

// Caractéristiques importantes :

//     L'algorithme est simple et direct, effectuant un seul passage sur les données pour calculer la somme.
//     Il gère correctement le cas d'une liste vide.
//     L'utilisation de double pour les notes permet de gérer des valeurs décimales.

// En résumé, c'est un algorithme de parcours linéaire avec une complexité temporelle et spatiale de O(n). Il est efficace pour sa tâche spécifique de calculer la moyenne d'une liste de notes, et sa performance dépendra directement du nombre de notes dans la liste d'entrée.