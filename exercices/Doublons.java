package exercices;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Doublons {
// Élimination des doublons dans une liste :
// Ecrire un script qui supprime tous les doublons dans une liste, attention
// l’ordre doit rester le même

        public static void supprimerDoublons() {
        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Création de la liste initiale
        List<Integer> liste = new ArrayList<>();
        
        // Demande à l'utilisateur d'entrer les nombres
        System.out.println("Entrez les nombres de la liste (à chaque nombre entrez et saisir la note suivante puis entrez er saisir'fin' pour terminer) :");
        
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
        
        // Utilisation d'un LinkedHashSet pour supprimer les doublons tout en préservant l'ordre
        LinkedHashSet<Integer> ensembleSansDoublons = new LinkedHashSet<>(liste);
        
        // Conversion du LinkedHashSet en List pour l'affichage
        List<Integer> listeSansDoublons = new ArrayList<>(ensembleSansDoublons);
        
        // Affichage des résultats
        System.out.println("Liste originale : " + liste);
        System.out.println("Liste sans doublons : " + listeSansDoublons);
        }
}
