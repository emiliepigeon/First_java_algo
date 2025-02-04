package exercices;

import java.util.Scanner;

public class Photocopies {
// Script prend en entrée un nombre de photocopies a faire, indiquez le prix de la
// commande en sachant que :
// - de 1 à 10 photocopies le prix est de 0.20€ par page
// - de 11 à 30 photocopies le prix est de 0.15€ par page
// - de 31 à n photocopies le prix est de 0.10€ par page
    
    public static void calculerPrixPhotocopies() {
        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer le nombre de photocopies
        System.out.print("Entrez le nombre de photocopies : ");
        
        // Lecture du nombre de photocopies
        int nombrePhotocopies;
        try {
            nombrePhotocopies = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            // Si l'utilisateur n'entre pas un nombre valide, on affiche un message d'erreur et on termine la méthode
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            return;
        }
        
        // Calcul du prix selon le nombre de photocopies
        double prix;
        if (nombrePhotocopies <= 10) {
            prix = nombrePhotocopies * 0.20;
        } else if (nombrePhotocopies <= 30) {
            prix = 10 * 0.20 + (nombrePhotocopies - 10) * 0.15;
        } else {
            prix = 10 * 0.20 + 20 * 0.15 + (nombrePhotocopies - 30) * 0.10;
        }
        
        // Affichage du résultat
        System.out.printf("Le prix pour %d photocopies est de %.2f€%n", nombrePhotocopies, prix);
    }
}


    // Début
    //     Lire nombre_photocopies
    //     Si nombre_photocopies ≤ 10 Alors
    //         prix ← nombre_photocopies * 0.20
    //     Sinon Si nombre_photocopies ≤ 30 Alors
    //         prix ← 10 * 0.20 + (nombre_photocopies - 10) * 0.15
    //     Sinon
    //         prix ← 10 * 0.20 + 20 * 0.15 + (nombre_photocopies - 30) * 0.10
    //     FinSi
    //     Afficher "Le prix total est : " + prix
    // Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de calcul conditionnel qui utilise une structure de décision (if-else if-else) pour déterminer le prix en fonction du nombre de photocopies.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée.
//     La structure de décision (if-else if-else) s'exécute en temps constant.
//     Le calcul du prix est effectué en une seule étape, quelle que soit la quantité de photocopies.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (nombrePhotocopies, prix), indépendamment de la valeur de l'entrée.

// Caractéristiques importantes :

//     L'algorithme gère trois tranches de tarification différentes.
//     Il gère les erreurs d'entrée (si l'utilisateur n'entre pas un nombre valide).
//     Le calcul du prix est optimisé pour chaque tranche, en utilisant les résultats des tranches précédentes.

// En résumé, c'est un algorithme simple et efficace avec une complexité constante en temps et en espace. Sa performance reste la même quelle que soit la quantité de photocopies entrée, ce qui le rend très rapide et prévisible en termes de temps d'exécution.