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

