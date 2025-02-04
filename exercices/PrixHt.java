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

