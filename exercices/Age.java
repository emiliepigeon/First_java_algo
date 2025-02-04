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


