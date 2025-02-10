package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Moyenne {
// Script prend une liste de notes en entrée, indiquez la moyenne de la liste.  

    public static void calculerMoyenne() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listeDeNotes = new ArrayList<>();
        
        // Lire la liste de notes
        System.out.println("Entrez une série de notes: (entre chaque note touche entrée et entrée puis saisir 'fin' pour terminer) :");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                double note = Double.parseDouble(input);
                listeDeNotes.add(note);
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'fin'.");
            }
        }
        
        if (listeDeNotes.isEmpty()) {
            System.out.println("Aucune note n'a été entrée.");
            return;
        }
        
        // Calculer la somme
        double somme = 0;
        for (double note : listeDeNotes) {
            somme += note;
        }
        
        // Calculer la moyenne
        double moyenne = somme / listeDeNotes.size();
        
        // Afficher le résultat
        System.out.printf("La moyenne est : %.2f%n", moyenne);
    }
}

