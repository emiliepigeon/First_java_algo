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

// PSEUDO CODE
// 			Début
// 				Lire nombre1
// 				Lire nombre2
// 				somme ← nombre1 + nombre2
// 				Afficher "La somme est : " + somme
// 			Fin


// NOTES ANNEXES

// Type d'algorithme :
//     C'est un algorithme simple et linéaire qui effectue une addition de deux nombres.
//  Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la taille des entrées :
//         Deux lectures d'entrées utilisateur
//         Une addition
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur des nombres entrés.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si les nombres d'entrée deviennent très grands.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (nombre1, nombre2, somme), indépendamment de la taille des entrées.
