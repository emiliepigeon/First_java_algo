package exercices;

import java.util.Scanner;

public class CalculAssurance {
// Script:
// Calcul de la prime d’assurance basée sur des critères
// Règles :
// Prime de base: Voiture  500€, Moto  300€, Camion  1000€.
// Majoration pour âge du véhicule : 10% si le véhicule a plus de 5 ans.
// Majoration pour kilométrage annuel : 5% si plus de 20 000 km,  15%
// si plus de 30 000km       

        public static void calculerPrimeAssurance() {
                Scanner scanner = new Scanner(System.in);
        
                // Demande du type de véhicule
                System.out.println("Entrez le type de véhicule (Voiture, Moto ou Camion) :");
                String typeVehicule = scanner.nextLine().toLowerCase();
        
                // Demande de l'âge du véhicule
                System.out.println("Entrez l'âge du véhicule en années :");
                int ageVehicule = Integer.parseInt(scanner.nextLine());
        
                // Demande du kilométrage annuel
                System.out.println("Entrez le kilométrage annuel :");
                int kilometrageAnnuel = Integer.parseInt(scanner.nextLine());
        
                double prime = 0;

                // Définition de la prime de base selon le type de véhicule
        switch (typeVehicule) {
                case "voiture":
                        prime = 500;
                        break;
                case "moto":
                        prime = 300;
                        break;
                case "camion":
                        prime = 1000;
                        break;
        default:
                System.out.println("Type de véhicule non reconnu. Calcul impossible.");
                return;
        }

        // Majoration pour l'âge du véhicule
        if (ageVehicule > 5) {
            prime *= 1.10; // +10%
        }

        // Majoration pour le kilométrage annuel
        if (kilometrageAnnuel > 30000) {
            prime *= 1.15; // +15%
        } else if (kilometrageAnnuel > 20000) {
            prime *= 1.05; // +5%
        }

        // Affichage du résultat
        System.out.printf("Prime d'assurance : %.2f€%n", prime);
        }
}
