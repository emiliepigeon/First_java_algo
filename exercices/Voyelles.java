package exercices;

import java.util.Scanner;

public class Voyelles {
// Script demande un mot a l’utilisateur en entrée, indiquez le nombre de voyelle que le mot contient.

    public static void compterVoyelles() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le mot
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().toLowerCase();
        
        String voyelles = "aeiouy";
        int compteurVoyelles = 0;
        
        // Compter les voyelles
        for (char lettre : mot.toCharArray()) {
            if (voyelles.indexOf(lettre) != -1) {
                compteurVoyelles++;
            }
        }
        
        // Afficher le résultat
        System.out.println("Nombre de voyelles : " + compteurVoyelles);
    }
}

