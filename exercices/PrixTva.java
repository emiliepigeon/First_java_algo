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
