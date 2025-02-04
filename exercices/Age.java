package exercices;

import java.util.Scanner;

public class Age {
    // Script demande l’âge d’un utilisateur et vous affichez majeur ou mineur.
    
    public static void verifierAge() {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Déclaration de la variable pour stocker l'âge
        int age;
        
        // Demande de l'âge à l'utilisateur
        System.out.print("Veuillez entrer votre âge : ");
        
        // Lecture de l'âge
        age = Integer.parseInt(scanner.nextLine());
        
        // Vérification de l'âge et affichage du résultat
        if (age >= 18) {
            System.out.println("Majeur");
        } else {
            System.out.println("Mineur");
        }
        
        // Note : Ne fermez pas le scanner ici si vous l'utilisez dans d'autres parties du programme
    }
}

//PSEUDO CODE
		// Début
		// 	Lire age
		// 		Si age ≥ 18 Alors
		// 			Afficher "Majeur"
		// 		Sinon
		// 			Afficher "Mineur"
		// 		FinSi
		// Fin

// NOTES
//  Type d'algorithme :
//     C'est un algorithme de décision simple qui utilise une structure conditionnelle (if-else) pour classer une entrée dans l'une des deux catégories.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée :
//         Une lecture d'entrée utilisateur
//         Une comparaison (if-else)
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur de l'âge entré.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si l'âge entré est très grand.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (age), indépendamment de la valeur de l'entrée.
