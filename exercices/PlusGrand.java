package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusGrand {
// Script prend une liste en entrée, indiquez le plus grand élément de la liste.
    
    public static void trouverPlusGrand() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();
        
        // Lire la liste de nombres
        System.out.println("Entrez une série de nombres: (entre chaque nombre touche entrée et entrée puis saisir 'fin' pour terminer) :");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                int nombre = Integer.parseInt(input);
                liste.add(nombre);
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'fin'.");
            }
        }
        
        if (liste.isEmpty()) {
            System.out.println("La liste est vide.");
            return;
        }
        
        // Trouver le plus grand élément
        int plusGrand = liste.get(0);
        for (int nombre : liste) {
            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
        }
        
        // Afficher le résultat
        System.out.println("Le plus grand élément est : " + plusGrand);
    }
}

