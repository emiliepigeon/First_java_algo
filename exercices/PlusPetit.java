package exercices;

import java.util.ArrayList;
import java.util.Scanner;
// Script prend une liste en entrée, indiquez le plus petit élément de la liste
public class PlusPetit {
    
    public static void trouverPlusPetit() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();
        
        // Lire la liste de nombres
        System.out.println("Entrez une série de nombres: (entre chaque nombre touche entrez et entrer 'fin' pour terminer) :");
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
        
        // Trouver le plus petit élément
        int plusPetit = liste.get(0);
        for (int nombre : liste) {
            if (nombre < plusPetit) {
                plusPetit = nombre;
            }
        }
        
        // Afficher le résultat
        System.out.println("Le plus petit élément est : " + plusPetit);
    }
}

