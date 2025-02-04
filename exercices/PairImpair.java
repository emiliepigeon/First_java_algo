package exercices;

import java.util.Scanner;

public class PairImpair {
    // Script demande 1 nombre en entrée et vous retournez pair ou impair.
    
    public static void verifierPairImpair() {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Déclaration de la variable pour stocker le nombre
        int nombre;
        
        // Demande du nombre à l'utilisateur
        System.out.print("Veuillez entrer un nombre entier : ");
        
        // Lecture du nombre
        nombre = Integer.parseInt(scanner.nextLine());
        
        // Vérification si le nombre est pair ou impair
        if (nombre % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
        
        // Note : Ne fermez pas le scanner ici si vous l'utilisez dans d'autres parties du programme
    }
}

// PSEUDO CODE
        // Début
        // 		Lire nombre
        // 			Si nombre modulo 2 = 0 Alors
        // 				Afficher "Pair"
        // 			Sinon
        // 				Afficher "Impair"
        // 			FinSi
        // 	Fin

// NOTES ANNEXES
//   Type d'algorithme :
//     C'est un algorithme de décision simple qui utilise une opération de modulo pour déterminer si un nombre est pair ou impair.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée :
//         Une lecture d'entrée utilisateur
//         Une opération de modulo
//         Une décision conditionnelle (if-else)
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur du nombre entré.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si le nombre devient très grand.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (nombre), indépendamment de la valeur de l'entrée.

// Caractéristiques importantes :

//     L'algorithme est très simple et direct.
//     Il utilise l'opération de modulo (%) pour déterminer si un nombre est pair ou impair.
//     La décision est binaire : soit le nombre est pair, soit il est impair.

// En résumé, c'est un algorithme extrêmement efficace avec une complexité constante en temps et en espace, ce qui le rend très rapide et prévisible en termes de temps d'exécution, quelle que soit la valeur du nombre entré.