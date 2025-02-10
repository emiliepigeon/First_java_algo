package exercices; // Déclaration du package auquel appartient cette classe. Les packages aident à organiser le code en regroupant les classes similaires.

import java.util.Scanner; // Importation de la classe Scanner depuis le package java.util. Cette classe permet de lire les entrées de l'utilisateur.

public class Menu {
    // Méthode principale pour afficher le menu et gérer les choix de l'utilisateur
    public static void afficherMenu() {
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);
        int choix; // Variable pour stocker le choix de l'utilisateur
        
        // Boucle do-while pour afficher le menu tant que l'utilisateur ne choisit pas de quitter (choix = 0)
        do {
            // Affichage du menu principal
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
            System.out.println("17. Éliminer les doublons");
            System.out.println("18. Calcul assurance");17
            System.out.println("19. Assurance catégorie");
            System.out.println("0. Quitter");

            // Demande à l'utilisateur d'entrer son choix
            System.out.print("Votre choix : ");
            
            // Lecture du choix de l'utilisateur (converti en entier)
            choix = Integer.parseInt(scanner.nextLine());
            
            // Utilisation d'un switch pour exécuter une action en fonction du choix de l'utilisateur
            switch (choix) {
                case 1:
                    // Appelle la méthode pour calculer la somme de deux nombres
                    Somme.executerSomme();
                    break;
                case 2:
                    // Appelle la méthode pour vérifier l'âge
                    Age.verifierAge();
                    break;
                case 3:
                    // Appelle la méthode pour vérifier si un nombre est pair ou impair
                    PairImpair.verifierPairImpair();
                    break;
                case 4:
                    // Appelle la méthode pour inverser une chaîne de caractères
                    Inverse.inverserChaine();                    
                    break;
                case 5:
                    // Appelle la méthode pour compter le nombre de voyelles dans un mot ou une phrase
                    Voyelles.compterVoyelles();                    
                    break;
                case 6:
                    // Appelle la méthode pour vérifier si un mot est un palindrome
                    Palindrome.verifierPalindrome();                    
                    break;
                case 7:
                    // Appelle la méthode pour trouver le plus petit nombre dans une liste
                    PlusPetit.trouverPlusPetit();                    
                    break;
                case 8:
                    // Appelle la méthode pour trouver le plus grand nombre dans une liste
                    PlusGrand.trouverPlusGrand();                    
                    break;
                case 9:
                    // Appelle la méthode pour calculer une moyenne
                    Moyenne.calculerMoyenne();                    
                    break; 
                case 10:
                    // Appelle la méthode pour trouver le nombre qui se répète le plus souvent
                    PlusRepete.trouverPlusRepete();                    
                    break;
                case 11:
                    // Appelle la méthode pour calculer la somme des nombres pairs dans une liste
                    SommePairs.calculerSommePairs();                    
                    break;
                case 12:
                    // Appelle la méthode pour afficher une table de multiplication
                    Multiplication.afficherTableMultiplication();                    
                    break;
                case 13:
                    // Appelle la méthode pour calculer un prix hors taxes (HT)
                    PrixHt.calculerPrixHT();                    
                    break;
                case 14:
                    // Appelle la méthode pour calculer un prix avec TVA
                    PrixTva.calculerTVA();
                    break;
                case 15:
                    // Appelle la méthode pour calculer le prix d'une commande de photocopies
                    Photocopies.calculerPrixPhotocopies();                    
                    break;
                case 16:
                    // Appelle la méthode pour afficher les termes d'une suite de Fibonacci
                    Fibonacci.afficherSuiteFibonacci();                    
                    break;
                case 17:
                    // Appelle la méthode pour éliminer les doublons dans une liste ou un tableau
                    Doublons.supprimerDoublons();                    
                    break;
                case 18:
                    // Appelle la méthode pour calculer une prime d'assurance en fonction des critères donnés
                    CalculAssurance.calculerPrimeAssurance();                    
                    break;
                case 19:
                    // Appelle la méthode pour déterminer une catégorie d'assurance en fonction du véhicule
                    CatVehicules.determinerCategorieAssurance();                    
                    break;                                                                                                                                                                                                                                         
                case 0:
                    // Message affiché lorsque l'utilisateur choisit de quitter le programme
                    System.out.println("Au revoir !");
                    break;
                default:
                    // Message affiché si l'utilisateur entre un choix invalide
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 0); // Continue tant que l'utilisateur n'a pas choisi "0" (Quitter)
        
        // Fermeture du scanner (bonne pratique)
        scanner.close();
    }
}
