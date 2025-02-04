package exercices;

import java.util.Scanner;

public class Menu {
    public static void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Somme de deux nombres");
            System.out.println("2. Vérification de l'âge");
            System.out.println("3. Vérification pair/impair");
            System.out.println("4. Inverser mot");
            System.out.println("5. Nombre de voyelles");
            System.out.println("6. Palindrome ?");
            System.out.println("7. Plus petit");
            System.out.println("8. Plus grand");
            System.out.println("9. Calcul moyenne");
            System.out.println("10. Nombre le plus répété");
            System.out.println("11. Somme des nombres pairs");
            System.out.println("12. Table de multiplication");
            System.out.println("13. Prix HT");
            System.out.println("14. Prix TVA");
            System.out.println("15. Commande photocopies");
            System.out.println("16. Suite de Fibonacci");
            System.out.println("17. Eliminer les doublons");
            System.out.println("18. Calcul assurance");
            System.out.println("19. Assurance catégorie");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            
            choix = Integer.parseInt(scanner.nextLine());
            
            switch (choix) {
                case 1:
                    Somme.executerSomme();
                    break;
                case 2:
                    Age.verifierAge();
                    break;
                case 3:
                    PairImpair.verifierPairImpair();
                    break;
                case 4:
                    Inverse.inverserChaine();                    
                    break;
                case 5:
                    Voyelles.compterVoyelles();                    
                    break;
                case 6:
                    Palindrome.verifierPalindrome();                    
                    break;
                case 7:
                    PlusPetit.trouverPlusPetit();                    
                    break;
                case 8:
                    PlusGrand.trouverPlusGrand();                    
                    break;
                case 9:
                    Moyenne.calculerMoyenne();                    
                    break; 
                case 10:
                    PlusRepete.trouverPlusRepete();                    
                    break;
                case 11:
                    SommePairs.calculerSommePairs();                    
                    break;
                case 12:
                    Multiplication.afficherTableMultiplication();                    
                    break;
                case 13:
                    PrixHt.calculerPrixHT();                    
                    break;
                case 14:
                    PrixTva.calculerTVA();
                    break;
                case 15:
                    Photocopies.calculerPrixPhotocopies();                    
                    break;
                case 16:
                    Fibonacci.afficherSuiteFibonacci();                    
                    break;
                case 17:
                    Doublons.supprimerDoublons();                    
                    break;
                case 18:
                    CalculAssurance.calculerPrimeAssurance();                    
                    break;
                case 19:
                    CatVehicules.determinerCategorieAssurance();                    
                    break;                                                                                                                                                                                                                                         
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 0);
        
        scanner.close();
    }
}
