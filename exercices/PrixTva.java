package exercices;

import java.util.Scanner;

public class PrixTva {
// Script prend en entrée un prix HT, indiquez le montant de la TVA 5%
    
    public static void calculerTVA() {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le prix HT
        System.out.print("Entrez le prix HT : ");
        double prixHT = Double.parseDouble(scanner.nextLine());
        
        // Calculer la TVA
        double TVA = prixHT * 0.05;
        
        // Afficher le résultat
        System.out.printf("Le montant de la TVA est : %.2f€%n", TVA);
    }
}


    // System.out.printf()

    // System.out est un objet qui représente la sortie standard (généralement la console ou le terminal).
    // printf() est une méthode de cet objet qui permet d'afficher du texte formaté. Elle est similaire à System.out.println(), mais offre plus de contrôle sur la façon dont les données sont affichées.

    // "Le montant de la TVA est : %.2f€%n"

    // C'est une chaîne de formatage. Elle contient le texte à afficher ainsi que des spécificateurs de format (ici, %.2f et %n).
    // %.2f est un spécificateur de format qui indique comment formater une valeur de type float ou double (un nombre décimal).
    //     % indique le début d'un spécificateur de format.
    //     .2 signifie que l'on veut afficher deux chiffres après la virgule.
    //     f indique que la valeur est un nombre à virgule flottante.
    // € est simplement le symbole de l'euro, qui sera affiché tel quel.
    // %n est un spécificateur de format qui insère un saut de ligne. 
    // C'est l'équivalent de \n dans une chaîne de caractères.
    // , TVA

    // Après la chaîne de formatage, on trouve une virgule suivie de TVA. TVA est le nom de la variable dont la valeur sera insérée dans la chaîne de formatage à la place de %.2f.
    // Il est essentiel que le type de la variable (TVA) corresponde au spécificateur de format (%.2f). Si TVA est un int, float ou double, tout ira bien.

