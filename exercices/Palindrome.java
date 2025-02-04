package exercices;

import java.util.Scanner;

public class Palindrome {
// Script demande un mot en entrée, indiquez si le mot est un palindrome ou non.
    
    public static void verifierPalindrome() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le mot
        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().toLowerCase();
        
        // Inverser le mot
        String motInverse = "";
        for (int i = mot.length() - 1; i >= 0; i--) {
            motInverse += mot.charAt(i);
        }
        
        // Vérifier si c'est un palindrome
        if (mot.equals(motInverse)) {
            System.out.println("C'est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }
    }
}

