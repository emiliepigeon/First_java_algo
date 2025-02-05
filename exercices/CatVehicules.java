package exercices;

import java.util.Scanner;

public class CatVehicules {
// Script:
// Catégorie d'assurance pour un véhicule
// Ecrire un script qui retourne la catégorie d’un assuré en fonction des critères
// suivants
// Critères :
// Catégorie "Rouge" Moins de 2 ans de permis ou plus de 3 accidents.
// Catégorie "Orange"  Moins de 5 ans de permis et entre 1 et 2
// accidents.
// Catégorie "Vert"  Plus de 5 ans de permis, avec moins de 1 accident.
// Catégorie "Bleu"  Plus de 10 ans de permis sans accident.

        public static void determinerCategorieAssurance() {
                Scanner scanner = new Scanner(System.in);
        
                // Demande du nombre d'années de permis
                System.out.println("Entrez le nombre d'années de permis :");
                int anneesPermis = Integer.parseInt(scanner.nextLine());
        
                // Demande du nombre d'accidents
                System.out.println("Entrez le nombre d'accidents :");
                int accidents = Integer.parseInt(scanner.nextLine());
        
                // Initialisation de la catégorie par défaut
                String categorie = "Non défini";

                // Détermination de la catégorie d'assurance
                if (anneesPermis < 2 || accidents > 3) {
                categorie = "Rouge";
                } else if (anneesPermis < 5 && accidents >= 1 && accidents <= 2) {
                categorie = "Orange";
                } else if (anneesPermis > 5 && accidents < 1) {
                categorie = "Vert";
                } else if (anneesPermis > 10 && accidents == 0) {
                categorie = "Bleu";
                }

        // Affichage du résultat
        System.out.println("Catégorie d'assurance : " + categorie);
        }
}
