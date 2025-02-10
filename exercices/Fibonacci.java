package exercices;

import java.util.Scanner;

public class Fibonacci {
// Script qui calcule jusqu’à un nombre donner le suite de Fibonacci.
    
    public static void afficherSuiteFibonacci() {
        // Création d'un Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur d'entrer le nombre de termes
        System.out.print("Combien de nombres de la suite de Fibonacci souhaitez-vous afficher ?");
        
        // Lecture du nombre de termes
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("Veuillez entrer un nombre non négatif.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier non négatif.");
            return;
        }
        
        // Traitement des cas particuliers
        if (n == 0) {
            System.out.println("Suite de Fibonacci : ");
            return;
        } else if (n == 1) {
            System.out.println("Suite de Fibonacci : 0");
            return;
        }
        
        // Initialisation des premiers termes
        long f0 = 0, f1 = 1;
        
        System.out.print("Suite de Fibonacci : " + f0 + ", " + f1);
        
        // Calcul et affichage des termes suivants
        for (int i = 2; i < n; i++) {
            long fn = f0 + f1;
            System.out.print(", " + fn);
            f0 = f1;
            f1 = fn;
        }
        System.out.println();
    }
}
