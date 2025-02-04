package exercices;

import java.util.Scanner;

public class CalculAssurance {
// Script:
// Calcul de la prime d’assurance basée sur des critères
// Règles :
// Prime de base: Voiture  500€, Moto  300€, Camion  1000€.
// Majoration pour âge du véhicule : 10% si le véhicule a plus de 5 ans.
// Majoration pour kilométrage annuel : 5% si plus de 20 000 km,  15%
// si plus de 30 000km       

        public static void calculerPrimeAssurance() {
                Scanner scanner = new Scanner(System.in);
        
                // Demande du type de véhicule
                System.out.println("Entrez le type de véhicule (Voiture, Moto ou Camion) :");
                String typeVehicule = scanner.nextLine().toLowerCase();
        
                // Demande de l'âge du véhicule
                System.out.println("Entrez l'âge du véhicule en années :");
                int ageVehicule = Integer.parseInt(scanner.nextLine());
        
                // Demande du kilométrage annuel
                System.out.println("Entrez le kilométrage annuel :");
                int kilometrageAnnuel = Integer.parseInt(scanner.nextLine());
        
                double prime = 0;

                // Définition de la prime de base selon le type de véhicule
        switch (typeVehicule) {
                case "voiture":
                        prime = 500;
                        break;
                case "moto":
                        prime = 300;
                        break;
                case "camion":
                        prime = 1000;
                        break;
        default:
                System.out.println("Type de véhicule non reconnu. Calcul impossible.");
                return;
        }

        // Majoration pour l'âge du véhicule
        if (ageVehicule > 5) {
            prime *= 1.10; // +10%
        }

        // Majoration pour le kilométrage annuel
        if (kilometrageAnnuel > 30000) {
            prime *= 1.15; // +15%
        } else if (kilometrageAnnuel > 20000) {
            prime *= 1.05; // +5%
        }

        // Affichage du résultat
        System.out.printf("Prime d'assurance : %.2f€%n", prime);
        }
}



// PSEUDO CODE
// Début
//     // Données de base
//     type_vehicule ← "Voiture"      // Peut être "Voiture", "Moto" ou "Camion"
//     age_vehicule ← 6               // Âge du véhicule en années
//     kilometrage_annuel ← 25000     // Kilométrage annuel
//     prime ← 0                      // Initialisation de la prime de base

//     // Définition de la prime de base selon le type de véhicule
//     Si type_vehicule = "Voiture" Alors
//         prime ← 500
//     Sinon Si type_vehicule = "Moto" Alors
//         prime ← 300
//     Sinon Si type_vehicule = "Camion" Alors
//         prime ← 1000
//     FinSi

//     // Majoration pour l'âge du véhicule
//     Si age_vehicule > 5 Alors
//         prime ← prime * 1.10       // +10%
//     FinSi

//     // Majoration pour le kilométrage annuel
//     Si kilometrage_annuel > 30000 Alors
//         prime ← prime * 1.15       // +15%
//     Sinon Si kilometrage_annuel > 20000 Alors
//         prime ← prime * 1.05       // +5%
//     FinSi

//     Afficher "Prime d'assurance :", prime
// Fin


// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de calcul conditionnel qui utilise une combinaison de structures switch et if-else pour déterminer la prime d'assurance en fonction de plusieurs critères.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment des valeurs d'entrée :
//         Trois lectures d'entrées utilisateur
//         Un switch pour déterminer la prime de base
//         Deux vérifications conditionnelles (if et if-else) pour les majorations
//         Un calcul final et un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur des entrées.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (typeVehicule, ageVehicule, kilometrageAnnuel, prime), indépendamment des valeurs d'entrée.

// Caractéristiques importantes :

//     L'algorithme gère trois types de véhicules avec des primes de base différentes.
//     Il applique des majorations basées sur l'âge du véhicule et le kilométrage annuel.
//     Le calcul est effectué par étapes, en appliquant des pourcentages de majoration.
//     Il gère le cas d'un type de véhicule non reconnu.

// En résumé, c'est un algorithme efficace avec une complexité constante en temps et en espace. Il est rapide et prévisible en termes de temps d'exécution, quelle que soit la combinaison de type de véhicule, d'âge et de kilométrage entrée.