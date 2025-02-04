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

