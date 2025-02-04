package exercices;

import java.util.Scanner;

public class Photocopies {
// Script prend en entrée un nombre de photocopies a faire, indiquez le prix de la
// commande en sachant que :
// - de 1 à 10 photocopies le prix est de 0.20€ par page
// - de 11 à 30 photocopies le prix est de 0.15€ par page
// - de 31 à n photocopies le prix est de 0.10€ par page
    
    public static void calculerPrixPhotocopies() {
        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer le nombre de photocopies
        System.out.print("Entrez le nombre de photocopies : ");
        
        // Lecture du nombre de photocopies
        int nombrePhotocopies;
        try {
            nombrePhotocopies = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            // Si l'utilisateur n'entre pas un nombre valide, on affiche un message d'erreur et on termine la méthode
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            return;
        }
        
        // Calcul du prix selon le nombre de photocopies
        double prix;
        if (nombrePhotocopies <= 10) {
            prix = nombrePhotocopies * 0.20;
        } else if (nombrePhotocopies <= 30) {
            prix = 10 * 0.20 + (nombrePhotocopies - 10) * 0.15;
        } else {
            prix = 10 * 0.20 + 20 * 0.15 + (nombrePhotocopies - 30) * 0.10;
        }
        
        // Affichage du résultat
        System.out.printf("Le prix pour %d photocopies est de %.2f€%n", nombrePhotocopies, prix);
    }
}

