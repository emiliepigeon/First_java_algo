package exercices;

import java.util.Scanner;

public class Somme {
// Script demande 2 nombres en entrée et vous affichez le résultat de l’addition.
    
    // Méthode principale pour exécuter l'exercice de somme
    public static void executerSomme() {
        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Déclaration des variables pour stocker les nombres et la somme
        double nombre1, nombre2, somme;
        
        // Demande du premier nombre à l'utilisateur
        System.out.print("Veuillez entrer le premier nombre : ");
        // Lecture du premier nombre
        nombre1 = Double.parseDouble(scanner.nextLine());
        
        // Demande du deuxième nombre à l'utilisateur
        System.out.print("Veuillez entrer le deuxième nombre : ");
        // Lecture du deuxième nombre
        nombre2 = Double.parseDouble(scanner.nextLine());
        
        // Calcul de la somme
        somme = nombre1 + nombre2;
        
        // Affichage du résultat
        System.out.println("La somme est : " + somme);
        
        // Note : Ne fermez pas le scanner ici si vous l'utilisez dans d'autres parties du programme
    }
}
