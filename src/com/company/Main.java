package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercice 1 : entrez un chiffre compris entre 1 et 5 jusqu'a ce qu'il convienne.
        //Creation d'une boucle  si chiffre entre 1 et 5 on affiche "bravo","sinon vous vous etes trompé" (if else)

        //initialisation des differentes variables
        int numbreBetwenOneAndFive = 0;//création de la variable qui recevra la saisie.Initialisation de sa valeur à 0
        Scanner keybordEntry = new Scanner(System.in);//appel de la methode Scanner et création de la variable recevant l'entree clavier

        System.out.println("Entrez un chiffre entre un et cinq.");
        numbreBetwenOneAndFive = keybordEntry.nextInt();

        while (numbreBetwenOneAndFive > 5 || numbreBetwenOneAndFive < 1) {
            System.out.println("Vous vous êtes trompé. Entrez un chiffre compris entre un et cinq.");
            numbreBetwenOneAndFive = keybordEntry.nextInt();
        }
        System.out.println("Bravo !");
        //temps utilisé pour le codage : 1h00. 1 Probleme rencontré lors des premiers jets: inversion && et || (50% du temps alloué a l'identification du probleme).

        //exerice 2:
        // Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne. En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10

        int numbreBetwenTenAndTwenty = 0;//création de la variable qui recevra la saisie.Initialisation de sa valeur à 0
        Scanner keybordEntry2 = new Scanner(System.in);//appel de la methode Scanner et création de la variable recevant l'entree clavier

        System.out.println("Entrez un chiffre entre dix et vingt.");
        numbreBetwenTenAndTwenty = keybordEntry2.nextInt();

            if (numbreBetwenTenAndTwenty <= 9) {
                System.out.println("Plus grand !");
                System.out.println("Entrez un chiffre entre dix et vingt.");
                numbreBetwenTenAndTwenty = keybordEntry2.nextInt();
            }

            if (numbreBetwenTenAndTwenty >= 21) {
                System.out.println("Plus petit !");
                System.out.println("Entrez un chiffre entre dix et vingt.");
                numbreBetwenTenAndTwenty = keybordEntry2.nextInt();
            }
            //20 mn de codage. probleme else n'affiche pas bravo avec une commande else
            // else {System.out.println("Bravo!");}
            if (numbreBetwenTenAndTwenty<21 && numbreBetwenTenAndTwenty>9){
                System.out.println("Bravo !");//resolu apres 10 mn de recherches avec une autre condition if. Pourquoi else ne fonctionne pas ? A rechercher.
            }

            //Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27
        //creer une boucle qui incrémente une valeur de depart de 10.
        // afficher chaque valeur.
        int startValue=0;//initialisation de la variable de depart
        System.out.println("Donnez une valeur de départ.");
        startValue=keybordEntry.nextInt();
        startValue++;//probleme rencontré: affichage de 2 à 11 et non 3 à 12. Correction 2 à 3
        int endValue=startValue+10;//initialisation de la valeur de fin
        for (;startValue<endValue; startValue++){
            System.out.println(startValue);
        }//35 mn de codage pour réaliser le programme. Differents problemes: boucle for mairisée plus ou moins bien.
        //la condition de départ est a revoir ca reste flou etonnament ce qui a provoqué des erreurs.
        //bien lire le cahier des charges !!! resultat demande a l'affichage de X+1 à X+10 et non de X à X+10...
        //+20mn de recherche de causes de problemes


    }
}
