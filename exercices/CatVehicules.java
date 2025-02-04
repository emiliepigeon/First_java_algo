package exercices;

import java.util.Scanner;

public class CatVehicules {
// Script:
// Catégorie d'assurance pour un véhicule
// Ecrire un script qui retourne la catégorie d’un assuré en fonction des critères
// suivants
// Critères :
// Catégorie "Rouge" Moins de 2 ans de permis ou plus de 3 accidents.
// Catégorie "Orange"  Moins de 5 ans de permis et entre 1 et 2
// accidents.
// Catégorie "Vert"  Plus de 5 ans de permis, avec moins de 1 accident.
// Catégorie "Bleu"  Plus de 10 ans de permis sans accident.

        public static void determinerCategorieAssurance() {
                Scanner scanner = new Scanner(System.in);
        
                // Demande du nombre d'années de permis
                System.out.println("Entrez le nombre d'années de permis :");
                int anneesPermis = Integer.parseInt(scanner.nextLine());
        
                // Demande du nombre d'accidents
                System.out.println("Entrez le nombre d'accidents :");
                int accidents = Integer.parseInt(scanner.nextLine());
        
                // Initialisation de la catégorie par défaut
                String categorie = "Non défini";

                // Détermination de la catégorie d'assurance
                if (anneesPermis < 2 || accidents > 3) {
                categorie = "Rouge";
                } else if (anneesPermis < 5 && accidents >= 1 && accidents <= 2) {
                categorie = "Orange";
                } else if (anneesPermis > 5 && accidents < 1) {
                categorie = "Vert";
                } else if (anneesPermis > 10 && accidents == 0) {
                categorie = "Bleu";
                }

        // Affichage du résultat
        System.out.println("Catégorie d'assurance : " + categorie);
        }
}

// PSEUDO CODE
        // Début
        //     // Données d'entrée
        //     annees_permis ← 6     // Nombre d'années de permis
        //     accidents ← 2         // Nombre d'accidents

        //     // Initialisation de la catégorie par défaut
        //     categorie ← "Non défini"

        //     // Détermination de la catégorie d'assurance
        //     Si annees_permis < 2 ou accidents > 3 Alors
        //         categorie ← "Rouge"
        //     Sinon Si annees_permis < 5 et accidents ≥ 1 et accidents ≤ 2 Alors
        //         categorie ← "Orange"
        //     Sinon Si annees_permis > 5 et accidents < 1 Alors
        //         categorie ← "Vert"
        //     Sinon Si annees_permis > 10 et accidents = 0 Alors
        //         categorie ← "Bleu"
        //     FinSi

        //     Afficher "Catégorie d'assurance :", categorie
        // Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de décision conditionnelle qui utilise une structure if-else pour déterminer la catégorie d'assurance en fonction de critères multiples.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment des valeurs d'entrée :
//         Deux lectures d'entrées utilisateur
//         Une série de vérifications conditionnelles (if-else if)
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur des entrées.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (anneesPermis, accidents, categorie), indépendamment des valeurs d'entrée.

// Caractéristiques importantes :

//     L'algorithme gère plusieurs critères combinés (années de permis et nombre d'accidents).
//     Il utilise une structure de décision en cascade pour déterminer la catégorie.
//     Une catégorie par défaut "Non défini" est initialisée, ce qui permet de gérer les cas non prévus.

// En résumé, c'est un algorithme simple et efficace avec une complexité constante en temps et en espace. Il est très rapide et prévisible en termes de temps d'exécution, quelle que soit la combinaison d'années de permis et de nombre d'accidents entrée.