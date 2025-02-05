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
        System.out.println("Entrez une série de nombres: 
            (entre chaque nombre touche entrée et entrée puis saisir 'fin' pour terminer) :");
        
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


