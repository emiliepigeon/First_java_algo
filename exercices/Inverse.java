package exercices;

import java.util.Scanner;

public class Inverse {
    // Script demande une chaine de caractères en entrée et vous l’affichez dans le sens inverse.
        // exemple : hello world = dlrow olleh
    
    public static void inverserChaine() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire la chaîne
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();
        
        // Inverser la chaîne
        String chaineInversee = "";
        for (int i = chaine.length() - 1; i >= 0; i--) {
            chaineInversee += chaine.charAt(i);
        }
        
        // Afficher la chaîne inversée
        System.out.println("La chaîne inversée est : " + chaineInversee);
    }
}

