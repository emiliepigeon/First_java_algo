Exercices d'alorithmies débutants.
Vs Code + Vanilla JAVA (affichage uniquement en console)

Main.java + package "exercices"

package "exercices"
Menu.java pour faire un choix

19 exercices d'algo du plus simple au plus compliqué

/////////////////////////////////////////////////////////////

Exo 1 : Somme de 2 nombres => Somme.java

// PSEUDO CODE

// 			Début
// 				Lire nombre1
// 				Lire nombre2
// 				somme ← nombre1 + nombre2
// 				Afficher "La somme est : " + somme
// 			Fin

----------------------------------------------------------------------------------

// NOTES ANNEXES

// Type d'algorithme :
//     C'est un algorithme simple et linéaire qui effectue une addition de deux nombres.
//  Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la taille des entrées :
//         Deux lectures d'entrées utilisateur
//         Une addition
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur des nombres entrés.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si les nombres d'entrée deviennent très grands.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (nombre1, nombre2, somme), indépendamment de la taille des entrées.

/////////////////////////////////////////////////////////////

Exo 2 : Vérification de l'âge (Mineur ou majeur) => Age.java

//PSEUDO CODE

		// Début
		// 	Lire age
		// 		Si age ≥ 18 Alors
		// 			Afficher "Majeur"
		// 		Sinon
		// 			Afficher "Mineur"
		// 		FinSi
		// Fin

---------------------------------------------------------------------------------

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


/////////////////////////////////////////////////////////////


Exo 3 : Vérification : Pair ou impair? => PairImpair.java


// PSEUDO CODE

        // Début
        // 		Lire nombre
        // 			Si nombre modulo 2 = 0 Alors
        // 				Afficher "Pair"
        // 			Sinon
        // 				Afficher "Impair"
        // 			FinSi
        // 	Fin

----------------------------------------------------------------------------------       

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

/////////////////////////////////////////////////////////////

Exo 4 : Inverser une chaine de caractères (mot en verlan)? => Inverse.java


// PSEUDO CODE

    // Début
    // Lire chaine
    // chaine_inversée ← ""
    // Pour chaque caractère dans chaine
    // chaine_inversée ← caractère + chaine_inversée
    // FinPour
    // Afficher chaine_inversée
    // Fin

---------------------------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de parcours inverse et de construction de chaîne qui inverse l'ordre des caractères d'une chaîne donnée.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est la longueur de la chaîne d'entrée.

// Explications :

//     L'algorithme parcourt chaque caractère de la chaîne une seule fois, de la fin au début.
//     Pour chaque caractère, il effectue une opération de concaténation.
//     Le nombre d'opérations est directement proportionnel à la longueur de la chaîne.

//     Complexité spatiale :
//     La complexité spatiale est également O(n), où n est la longueur de la chaîne d'entrée.

// Explications +:

//     Une nouvelle chaîne (chaineInversee) est créée pour stocker le résultat.
//     Cette nouvelle chaîne aura la même longueur que la chaîne d'entrée.
//     L'espace utilisé croît linéairement avec la taille de l'entrée.

// Note importante sur l'efficacité :
// Bien que la complexité temporelle soit O(n), l'utilisation de la concaténation de chaînes (+=) dans une boucle peut être inefficace pour de très longues chaînes en Java. Pour une implémentation plus efficace, on pourrait utiliser un StringBuilder.

/////////////////////////////////////////////////////////////

Exo 5 : Compter le nombre de voyelles dans un mot => Voyelles.java

// PSEUDO CODE

    // Début
    //     Lire mot
    //     voyelles ← "aeiouy"
    //     compteur_voyelles ← 0
    //     Pour chaque lettre dans mot
    //         Si lettre est dans voyelles Alors
    //             compteur_voyelles ← compteur_voyelles + 1
    //         FinSi
    //     FinPour
    //     Afficher "Nombre de voyelles : " + compteur_voyelles
    // Fin


-------------------------------------------------------------------------

// NOTES ANNEXES

//     Type d'algorithme :
//           C'est un algorithme de parcours linéaire qui compte les occurrences de certains caractères (voyelles) dans une chaîne de caractères.
//     Complexité temporelle (Big O) :
//          La complexité de cet algorithme est O(n), où n est la longueur du mot entré.

// Explications :

//     L'algorithme parcourt chaque caractère du mot une seule fois.
//     Pour chaque caractère, il effectue une vérification (si c'est une voyelle).
//     Le nombre d'opérations est directement proportionnel à la longueur du mot.

//     Complexité spatiale :
//     La complexité spatiale est O(n), où n est la longueur du mot.

// Explications +:

//     La méthode toCharArray() crée un nouveau tableau de caractères de la même longueur que le mot, ce qui contribue à la complexité spatiale O(n).
//     Les autres variables (voyelles, compteurVoyelles) utilisent un espace constant.

/////////////////////////////////////////////////////////////

Exo 6 : Palindrome ou pas palindrome ? => Palindrome.java

// PSEUDO CODE

        // Début
        //     Lire mot
        //     mot_inversé ← ""
        //     Pour chaque caractère dans mot
        //         mot_inversé ← caractère + mot_inversé
        //     FinPour
        //     Si mot = mot_inversé Alors
        //         Afficher "C'est un palindrome"
        //     Sinon
        //         Afficher "Ce n'est pas un palindrome"
        //     FinSi
        // Fin

---------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de comparaison de chaînes qui utilise l'inversion de chaîne pour vérifier si un mot est un palindrome.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est la longueur du mot.

// Explications :

//     La boucle pour inverser le mot parcourt chaque caractère une fois : O(n)
//     La comparaison des chaînes (mot.equals(motInverse)) prend également O(n) dans le pire cas.
//     Donc, la complexité totale est O(n + n) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n).

// Explications +:

//     Une nouvelle chaîne (motInverse) est créée pour stocker le mot inversé, ce qui nécessite O(n) espace.
//     Les autres variables (mot) utilisent également O(n) espace.

// Caractéristiques importantes :

//     L'algorithme convertit le mot en minuscules pour ignorer la casse.
//     Il utilise une approche simple d'inversion de chaîne pour vérifier le palindrome.
//     La comparaison finale est effectuée en une seule opération grâce à la méthode equals().

// En résumé, c'est un algorithme simple pour vérifier si un mot est un palindrome, avec une complexité temporelle et spatiale linéaire O(n). Bien qu'il soit efficace pour des mots courts à moyens, il pourrait être optimisé pour réduire l'utilisation de la mémoire en évitant la création d'une chaîne inversée complète.

/////////////////////////////////////////////////////////////

Exo 7 : Nombre le plus petit (d'une liste)? => PlusPetit.java

// PSEUDO CODE

    // Début
    //     Lire liste
    //     plus_petit ← premier élément de liste
    //     Pour chaque nombre dans liste
    //         Si nombre < plus_petit Alors
    //             plus_petit ← nombre
    //         FinSi
    //     FinPour
    //     Afficher "Le plus petit élément est : " + plus_petit
    // Fin

-----------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de recherche linéaire pour trouver le minimum dans une liste.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     La boucle de saisie des données prend O(n) temps.
//     Le parcours de la liste pour trouver le plus petit élément prend également O(n) temps.
//     Donc, la complexité totale est O(n + n) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n).

// Explications +:

//     L'ArrayList stocke tous les nombres entrés : O(n)
//     Les autres variables (plusPetit, nombre) utilisent un espace constant.

// Caractéristiques importantes :

//     L'algorithme parcourt la liste une seule fois pour trouver le plus petit élément.
//     Il gère correctement les entrées invalides et les listes vides.
//     Il initialise le plus petit élément avec le premier élément de la liste, ce qui est une approche efficace.

// En résumé, c'est un algorithme simple et efficace pour trouver le plus petit élément dans une liste, avec une complexité temporelle et spatiale linéaire O(n). Il est adapté pour des listes de toutes tailles et offre une bonne performance pour cette tâche spécifique.

/////////////////////////////////////////////////////////////

Exo 8 : Nombre le plus grand (d'une liste)? => PlusGrand.java

// PSEUDO CODE

    // Début
    //     Lire liste
    //     plus_grand ← premier élément de liste
    //     Pour chaque nombre dans liste
    //         Si nombre > plus_grand Alors
    //             plus_grand ← nombre
    //         FinSi
    //     FinPour
    //     Afficher "Le plus grand élément est : " + plus_grand
    // Fin

-----------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de recherche linéaire pour trouver le maximum dans une liste.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     La boucle de saisie des données prend O(n) temps.
//     Le parcours de la liste pour trouver le plus grand élément prend également O(n) temps.
//     Donc, la complexité totale est O(n + n) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n).

// Explications +:

//     L'ArrayList stocke tous les nombres entrés : O(n)
//     Les autres variables (plusGrand, nombre) utilisent un espace constant.

// Caractéristiques importantes :

//     L'algorithme parcourt la liste une seule fois pour trouver le plus grand élément.
//     Il gère correctement les entrées invalides et les listes vides.
//     Il initialise le plus grand élément avec le premier élément de la liste, ce qui est une approche efficace.

// En résumé, c'est un algorithme simple et efficace pour trouver le plus grand élément dans une liste, avec une complexité temporelle et spatiale linéaire O(n). Il est adapté pour des listes de toutes tailles et offre une bonne performance pour cette tâche spécifique.

/////////////////////////////////////////////////////////////

Exo 9 : Calculer une moyenne => Moyenne.java

// PSEODO CODE

    // Début
    //     Lire liste_de_notes
    //     somme ← 0
    //     Pour chaque note dans liste_de_notes
    //         somme ← somme + note
    //     FinPour
    //     moyenne ← somme / nombre d'éléments dans liste_de_notes
    //     Afficher "La moyenne est : " + moyenne
    // Fin

--------------------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de calcul de moyenne qui implique un parcours linéaire d'une liste pour calculer la somme, suivi d'une division.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre de notes dans la liste.

// Explications :

//     L'algorithme parcourt chaque élément de la liste une seule fois pour calculer la somme.
//     Le nombre d'opérations est directement proportionnel au nombre de notes dans la liste.
//     La division finale pour calculer la moyenne est une opération constante.

//     Complexité spatiale :
//     La complexité spatiale est O(n), où n est le nombre de notes entrées.

// Explications +:

//     Une ArrayList est utilisée pour stocker toutes les notes entrées, ce qui contribue à la complexité spatiale O(n).
//     Les autres variables (somme, moyenne) utilisent un espace constant.

// Caractéristiques importantes :

//     L'algorithme est simple et direct, effectuant un seul passage sur les données pour calculer la somme.
//     Il gère correctement le cas d'une liste vide.
//     L'utilisation de double pour les notes permet de gérer des valeurs décimales.

// En résumé, c'est un algorithme de parcours linéaire avec une complexité temporelle et spatiale de O(n). Il est efficace pour sa tâche spécifique de calculer la moyenne d'une liste de notes, et sa performance dépendra directement du nombre de notes dans la liste d'entrée.

/////////////////////////////////////////////////////////////

Exo 10 : Trouver le nombre le plus répété (d'une liste) => PlusRepete.java

// PSEUDO CODE

    // Début
    //     Lire liste
    //     Créer un dictionnaire compteur
    //     Pour chaque nombre dans liste
    //         Si nombre existe déjà dans compteur Alors
    //             compteur[nombre] ← compteur[nombre] + 1
    //         Sinon
    //             compteur[nombre] ← 1
    //         FinSi
    //     FinPour
    //     plus_repete ← clé avec la plus grande valeur dans compteur
    //     Afficher "Le nombre le plus répété est : " + plus_repete
    // Fin

------------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de comptage et de recherche du maximum qui utilise une structure de données de type HashMap pour optimiser le processus.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     La boucle de saisie des données prend O(n) temps.
//     Le parcours de la liste pour remplir le HashMap prend O(n) temps.
//     Le parcours du HashMap pour trouver le maximum prend O(m) temps, où m est le nombre de nombres uniques (m ≤ n).
//     Donc, la complexité totale est O(n + n + m) = O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(n) dans le pire cas.

// Explications +:

//     L'ArrayList stocke tous les nombres entrés : O(n)
//     Le HashMap stocke au maximum tous les nombres uniques : O(n) dans le pire cas où tous les nombres sont uniques.

// Caractéristiques importantes :

//     L'utilisation d'un HashMap permet un comptage efficace des occurrences.
//     L'algorithme gère correctement les entrées invalides et les listes vides.
//     Il trouve le nombre le plus répété en un seul passage sur le HashMap.

// En résumé, c'est un algorithme efficace pour trouver l'élément le plus répété dans une liste, avec une complexité temporelle et spatiale linéaire O(n). Il offre un bon équilibre entre performance et utilisation de la mémoire, particulièrement efficace pour de grandes listes avec des éléments répétés.

/////////////////////////////////////////////////////////////

Exo 11 : Somme des nombres pairs (d'une liste) => SommePairs.java

// PSEUDO CODE

    // Début
    //     Lire liste
    //     somme_pairs ← 0
    //     Pour chaque nombre dans liste
    //         Si nombre modulo 2 = 0 Alors
    //             somme_pairs ← somme_pairs + nombre
    //         FinSi
    //     FinPour
    //     Afficher "La somme des nombres pairs est : " + somme_pairs
    // Fin

---------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de parcours et de filtrage qui somme les éléments pairs d'une liste.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre d'éléments dans la liste.

// Explications :

//     L'algorithme parcourt chaque élément de la liste une seule fois.
//     Pour chaque élément, il effectue une vérification (si le nombre est pair) et potentiellement une addition.
//     Le nombre d'opérations est directement proportionnel au nombre d'éléments dans la liste.

//     Complexité spatiale :
//     La complexité spatiale est O(n), où n est le nombre d'éléments entrés par l'utilisateur.

// Explications +:

//     Une ArrayList est utilisée pour stocker tous les nombres entrés, ce qui contribue à la complexité spatiale O(n).
//     Les autres variables (sommePairs, nombre) utilisent un espace constant.

// En résumé, c'est un algorithme de parcours linéaire avec une complexité temporelle et spatiale de O(n). Il est efficace pour sa tâche spécifique de calculer la somme des nombres pairs dans une liste, et sa performance dépendra du nombre d'éléments dans la liste d'entrée. Note : La partie de saisie des données par l'utilisateur n'est généralement pas incluse dans l'analyse de complexité, car elle dépend de facteurs externes (vitesse de saisie de l'utilisateur). L'analyse se concentre sur le traitement des données une fois qu'elles sont dans la liste.

/////////////////////////////////////////////////////////////

Exo 12 : Table de multiplication => Multiplication.java

// PSEUDO CODE

    // Début
    //     Lire nombre
    //     Pour i allant de 1 à 10
    //         résultat ← nombre * i
    //         Afficher nombre + " x " + i + " = " + résultat
    //     FinPour
    // Fin

-------------------------------------------------------------------------

// NOTES ANNEXES

//     Type d'algorithme :
//          C'est un algorithme de génération de séquence, spécifiquement une table de multiplication.
//     Complexité temporelle (Big O) :
//          La complexité de cet algorithme est O(1), ou complexité constante.

// Explications :

//     L'algorithme effectue toujours exactement 10 itérations, quel que soit le nombre entré.
//     Le nombre d'opérations est fixe et ne dépend pas de la valeur d'entrée.

//     Complexité spatiale :
//     La complexité spatiale est également O(1), ou constante.

// Explications +:

//     L'algorithme utilise un nombre fixe de variables (nombre, i, resultat) quelle que soit la valeur d'entrée.
//     Aucune structure de données supplémentaire n'est créée en fonction de l'entrée.

// Caractéristiques importantes :

//     L'algorithme est très simple et direct.
//     Il gère les erreurs d'entrée (si l'utilisateur n'entre pas un nombre valide).
//     La performance de l'algorithme est constante, quelle que soit la valeur du nombre entré.

// En résumé, c'est un algorithme avec une complexité temporelle et spatiale constante O(1). Il est extrêmement efficace pour sa tâche spécifique d'afficher une table de multiplication jusqu'à 10, car son temps d'exécution et son utilisation de mémoire ne dépendent pas de la valeur d'entrée.

/////////////////////////////////////////////////////////////

Exo 13 : Calcul d'un prix HT à partir d'un prix TTC => PrixHt.java

// PSEUDO CODE

    // Début
    //     Lire prix_TTC
    //     prix_HT ← prix_TTC / 1.20
    //     Afficher "Le prix HT est : " + prix_HT
    // Fin

------------------------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de calcul simple qui effectue une opération arithmétique de base (division).
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée :
//         Une lecture d'entrée utilisateur
//         Une division
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur du prix TTC entré.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si le prix TTC devient très grand.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (prixTTC, prixHT), indépendamment de la valeur de l'entrée.

// Caractéristiques importantes :

//     L'algorithme est très simple et direct.
//     Il utilise un taux de TVA fixe de 20% (d'où la division par 1.20).
//     L'utilisation de double permet de gérer des prix avec des décimales.
//     Le résultat est formaté pour afficher deux décimales.

// En résumé, c'est un algorithme simple et efficace avec une complexité constante en temps et en espace, ce qui le rend très performant pour sa tâche spécifique de calcul du prix HT à partir du prix TTC. Sa performance reste la même quelle que soit la valeur du prix TTC entré.

/////////////////////////////////////////////////////////////

Exo 14 : Calcul de la TVA à partir d'un prix TTC => PrixTva.java


// PSEUDO CODE

    // Début
    //     Lire prix_HT
    //     TVA ← prix_HT * 0.05
    //     Afficher "Le montant de la TVA est : " + TVA
    // Fin

-----------------------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de calcul simple qui effectue une opération arithmétique de base (multiplication).
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée :
//         Une lecture d'entrée utilisateur
//         Une multiplication
//         Un affichage
//     Toutes ces opérations sont effectuées une seule fois, quelle que soit la valeur du prix HT entré.
//     La complexité O(1) indique que le temps d'exécution de l'algorithme reste constant, même si le prix HT devient très grand.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (prixHT, TVA), indépendamment de la valeur de l'entrée.

// Caractéristiques importantes :

//     L'algorithme est très simple et direct.
//     Il utilise un taux de TVA fixe de 5%.
//     L'utilisation de double permet de gérer des prix avec des décimales.
//     Le résultat est formaté pour afficher deux décimales.

// En résumé, c'est un algorithme simple et efficace avec une complexité constante en temps et en espace, ce qui le rend très performant pour sa tâche spécifique de calcul de TVA. Sa performance reste la même quelle que soit la valeur du prix HT entré.

/////////////////////////////////////////////////////////////

Exo 15 : Calcul de prix de photocopies pour des commandes en fonction de quantités => Photocopies.java

// Script prend en entrée un nombre de photocopies a faire, indiquez le prix de la
// commande en sachant que :
// - de 1 à 10 photocopies le prix est de 0.20€ par page
// - de 11 à 30 photocopies le prix est de 0.15€ par page
// - de 31 à n photocopies le prix est de 0.10€ par page

// PSEUDO CODE

    // Début
    //     Lire nombre_photocopies
    //     Si nombre_photocopies ≤ 10 Alors
    //         prix ← nombre_photocopies * 0.20
    //     Sinon Si nombre_photocopies ≤ 30 Alors
    //         prix ← 10 * 0.20 + (nombre_photocopies - 10) * 0.15
    //     Sinon
    //         prix ← 10 * 0.20 + 20 * 0.15 + (nombre_photocopies - 30) * 0.10
    //     FinSi
    //     Afficher "Le prix total est : " + prix
    // Fin
    
------------------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme de calcul conditionnel qui utilise une structure de décision (if-else if-else) pour déterminer le prix en fonction du nombre de photocopies.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(1), ce qui signifie qu'il a une complexité constante.

// Explications :

//     L'algorithme effectue un nombre fixe d'opérations, indépendamment de la valeur de l'entrée.
//     La structure de décision (if-else if-else) s'exécute en temps constant.
//     Le calcul du prix est effectué en une seule étape, quelle que soit la quantité de photocopies.

//     Complexité spatiale :
//     La complexité spatiale est également O(1) car l'algorithme utilise un nombre fixe de variables (nombrePhotocopies, prix), indépendamment de la valeur de l'entrée.

// Caractéristiques importantes :

//     L'algorithme gère trois tranches de tarification différentes.
//     Il gère les erreurs d'entrée (si l'utilisateur n'entre pas un nombre valide).
//     Le calcul du prix est optimisé pour chaque tranche, en utilisant les résultats des tranches précédentes.

// En résumé, c'est un algorithme simple et efficace avec une complexité constante en temps et en espace. Sa performance reste la même quelle que soit la quantité de photocopies entrée, ce qui le rend très rapide et prévisible en termes de temps d'exécution.

/////////////////////////////////////////////////////////////

Exo 16 : Suite de Fibonacci => Fibonacci.java


// PSEUDO CODE

    // Début
    //     Lire n
    //     Si n = 0 Alors
    //         Afficher 0
    //     Sinon Si n = 1 Alors
    //         Afficher 0, 1
    //         Sinon
    //             f0 ← 0
    //             f1 ← 1
    //         Afficher f0, f1
    //             Pour i allant de 2 à n - 1
    //                 fn ← f0 + f1
    //                 Afficher fn
    //                 f0 ← f1
    //                 f1 ← fn
    //             FinPour
    //     FinSi
    // Fin

---------------------------------------------------------------------

// NOTES ANNEXES

//   Type d'algorithme :
//     C'est un algorithme itératif qui génère la suite de Fibonacci jusqu'à un nombre donné de termes.
//   Complexité temporelle (Big O) :
//     La complexité de cet algorithme est O(n), où n est le nombre de termes de la suite de Fibonacci à générer.

// Explications :

//     La boucle principale s'exécute (n-2) fois, car les deux premiers termes sont traités séparément.
//     Chaque itération de la boucle effectue un nombre constant d'opérations (addition et affectations).
//     Donc, la complexité totale est O(n).

//     Complexité spatiale :
//     La complexité spatiale est O(1), constante.

// Explications +:

//     L'algorithme utilise un nombre fixe de variables (f0, f1, fn) quel que soit le nombre de termes à générer.
//     Il n'y a pas de structure de données supplémentaire qui grandit avec n.

// Caractéristiques importantes :

//     L'algorithme gère correctement les cas particuliers (n = 0 et n = 1).
//     Il utilise des variables de type long pour gérer de plus grands nombres dans la suite.
//     L'affichage se fait au fur et à mesure de la génération, évitant ainsi de stocker toute la suite en mémoire.

// En résumé, c'est un algorithme efficace pour générer la suite de Fibonacci, avec une complexité temporelle linéaire O(n) et une complexité spatiale constante O(1). Il est bien adapté pour générer un grand nombre de termes de la suite sans consommer beaucoup de mémoire.

/////////////////////////////////////////////////////////////

Exo 17 : Eliminer les doublons dans une liste de nombres => Doublons.java

/////////////////////////////////////////////////////////////

Exo 18 : Simulation de calcul de prime d'assurance pour véhicules => CalculAssurance.java

/////////////////////////////////////////////////////////////

Exo 19 : Simulation de catégories de prime d'assurance pour un assuré => CalculAssurance.java

/////////////////////////////////////////////////////////////
