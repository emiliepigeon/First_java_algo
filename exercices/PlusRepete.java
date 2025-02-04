package exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlusRepete {
// Script prend une liste de nombres en entrée, indiquez le nombre qui se répète le plus de fois dans la liste.
    
    public static void trouverPlusRepete() {
        // Je crée un Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Je prépare une liste pour stocker les nombres entrés par l'utilisateur
        ArrayList<Integer> liste = new ArrayList<>();
        
        // J'explique à l'utilisateur comment entrer les nombres
        System.out.println("Entrez une série de nombres (entrez 'fin' pour terminer) :");
        
        // Je commence une boucle qui continuera jusqu'à ce que l'utilisateur tape 'fin'
        while (true) {
            // Je lis ce que l'utilisateur a tapé
            String input = scanner.nextLine();
            
            // Si l'utilisateur a tapé 'fin', je sors de la boucle
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            
            // J'essaie de convertir l'entrée en nombre
            try {
                int nombre = Integer.parseInt(input);
                // Si ça marche, j'ajoute le nombre à ma liste
                liste.add(nombre);
            } catch (NumberFormatException e) {
                // Si ça ne marche pas, je dis à l'utilisateur que son entrée n'est pas valide
                System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'fin'.");
            }
        }
        
        // Je vérifie si la liste est vide
        if (liste.isEmpty()) {
            System.out.println("La liste est vide.");
            return; // Si elle est vide, je termine la méthode ici
        }
        
        // Je crée un "dictionnaire" pour compter combien de fois chaque nombre apparaît
        Map<Integer, Integer> compteur = new HashMap<>();
        
        // Pour chaque nombre dans ma liste...
        for (int nombre : liste) {
            // Je l'ajoute au compteur ou j'augmente son compte s'il y est déjà
            compteur.put(nombre, compteur.getOrDefault(nombre, 0) + 1);
        }
        
        // Je prépare des variables pour garder trace du nombre le plus répété
        int plusRepete = liste.get(0); // Je commence avec le premier nombre de la liste
        int maxOccurrences = 1; // Je suppose qu'il apparaît au moins une fois
        
        // Je parcours mon compteur
        for (Map.Entry<Integer, Integer> entry : compteur.entrySet()) {
            // Si je trouve un nombre qui apparaît plus souvent...
            if (entry.getValue() > maxOccurrences) {
                // Je mets à jour mes variables
                maxOccurrences = entry.getValue();
                plusRepete = entry.getKey();
            }
        }
        
        // J'affiche le résultat
        System.out.println("Le nombre le plus répété est : " + plusRepete);
        System.out.println("Il apparaît " + maxOccurrences + " fois.");
    }
}

// PSEUDO CODE
    // Début
    //     Lire liste
    //     Créer un dictionnaire compteur
    //     Pour chaque nombre dans liste
    //         Si nombre existe déjà dans compteur Alors
    //             compteur[nombre] ← compteur[nombre] + 1
    //         Sinon
    //             compteur[nombre] ← 1
    //         FinSi
    //     FinPour
    //     plus_repete ← clé avec la plus grande valeur dans compteur
    //     Afficher "Le nombre le plus répété est : " + plus_repete
    // Fin


// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de comptage et de recherche du maximum qui utilise une structure de données de type HashMap pour optimiser le processus.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     La boucle de saisie des données prend O(n) temps.
//     Le parcours de la liste pour remplir le HashMap prend O(n) temps.
//     Le parcours du HashMap pour trouver le maximum prend O(m) temps, où m est le nombre de nombres uniques (m ≤ n).
//     Donc, la complexité totale est O(n + n + m) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n) dans le pire cas.

// Explications +:

//     L'ArrayList stocke tous les nombres entrés : O(n)
//     Le HashMap stocke au maximum tous les nombres uniques : O(n) dans le pire cas où tous les nombres sont uniques.

// Caractéristiques importantes :

//     L'utilisation d'un HashMap permet un comptage efficace des occurrences.
//     L'algorithme gère correctement les entrées invalides et les listes vides.
//     Il trouve le nombre le plus répété en un seul passage sur le HashMap.

// En résumé, c'est un algorithme efficace pour trouver l'élément le plus répété dans une liste, avec une complexité temporelle et spatiale linéaire O(n). Il offre un bon équilibre entre performance et utilisation de la mémoire, particulièrement efficace pour de grandes listes avec des éléments répétés.