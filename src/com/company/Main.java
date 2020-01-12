package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercice 1 : entrez un chiffre compris entre 1 et 5 jusqu'a ce qu'il convienne.");

        //Creation d'une boucle  si chiffre entre 1 et 5 on affiche "bravo","sinon vous vous etes trompé" (while + if else)

                                                                                            //initialisation des differentes variables
        //int numbreBetwenOneAndFive =0 ;  //création de la variable qui recevra la saisie.Initialisation de sa valeur à 0. modification suite a un redondant alert
        Scanner keybordEntry = new Scanner(System.in);                                      //appel de la methode Scanner et création de la variable recevant l'entree clavier

        System.out.println("Entrez un chiffre entre un et cinq.");
        int numbreBetwenOneAndFive = keybordEntry.nextInt(); //declaration de la variable numberBetweenOneAndFive ici suite à l'alerte redondant. Effectif jusqu'a l'exercice 5

        while (numbreBetwenOneAndFive > 5 || numbreBetwenOneAndFive < 1) {
            System.out.println("Vous vous êtes trompé. Entrez un chiffre compris entre un et cinq.");
            numbreBetwenOneAndFive = keybordEntry.nextInt();
        }
        System.out.println("Bravo !");

        //temps utilisé pour le codage : 1h00. 1 Probleme rencontré lors des premiers jets: inversion && et || (50% du temps alloué a l'identification du probleme).

       System.out.println("Exercice 2: écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne. En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.");

        //int numbreBetwenTenAndTwenty = 0;                                     //création de la variable qui recevra la saisie.Initialisation de sa valeur à 0
        Scanner keybordEntry2 = new Scanner(System.in);                       //appel de la methode Scanner et création de la variable recevant l'entree clavier

        System.out.println("Entrez un chiffre entre dix et vingt.");
        int numbreBetwenTenAndTwenty = keybordEntry2.nextInt();

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

            /*20 mn de codage. probleme else n'affiche pas bravo avec une commande else :  else {System.out.println("Bravo!"); } */

            if (numbreBetwenTenAndTwenty<21 && numbreBetwenTenAndTwenty>9){
                System.out.println("Bravo !");        //resolu apres 10 mn de recherches avec une autre condition if. Pourquoi else ne fonctionne pas ? A rechercher.
            }

        System.out.println("Exercice 3: écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.");

        //int startValue2=0;                                             //initialisation de la variable de depart
        System.out.println("Donnez une valeur de départ.");
        int startValue2=keybordEntry.nextInt();                            //declaration startValue2 (j'avait fait ce meme exercice avec une boucle for trouvant que c'etait plus simple donc startValue etait deja prise)
        startValue2++;                                                 //la premiere valeur demandée a l'impression est de +1 apres la valeur d'entrée
        int endValue2=startValue2+10;                                  //la valeur butoir est de +10 par rapport a la valeur de départ. endValue deja prise (voir ci dessus)

            while (startValue2<endValue2)
            {
                System.out.println(startValue2);
                startValue2++;
            }
            // codage réalisé en 20 mn. J'ai commencé par des if/else, mais cela ne me convenais pas.Codage réalisé apres l'exercice 4.


        System.out.println("Exercice 4: Réécrire l'algorithme précédent, en utilisant cette fois l'instruction Pour");

        /*creer une boucle qui incrémente une valeur de depart de 10. Afficher chaque valeur.*/

        //int startValue=0;                              //initialisation de la variable de depart
        System.out.println("Donnez une valeur de départ.");
        int startValue=keybordEntry.nextInt();
        startValue++;                                  //probleme rencontré: affichage de 2 à 11 et non 3 à 12. Correction 2 à 3
        int endValue=startValue+10;                    //initialisation de la valeur de fin
        for (;startValue<endValue; startValue++){
            System.out.println(startValue);
        }
        /*35 mn de codage pour réaliser le programme. Differents problemes: boucle for mairisée plus ou moins bien.
        la condition de départ est a revoir ca reste flou etonnament ce qui a provoqué des erreurs.
        bien lire le cahier des charges !!! resultat demande a l'affichage de X+1 à X+10 et non de X à X+10...
        +20mn de recherche de causes de problemes*/

        System.out.println("Exercice 5\n" +
                "Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de multiplication de ce nombre, présentée comme suit (cas où\n" +
                "l'utilisateur entre le nombre 7) : Table de 7 : 7x1= 7 ,7 x 2 = 14, 7 x 3 = 21,...7 x 10 = 70");
        System.out.println("Entrez un nombre de départ.");
        int startNumber=keybordEntry.nextInt();
        int multiple=1;
        int resultOfTable=0;  //creation de cette variable apres le deboire de la ligne de commande startNumber=startNumber*multiple

        while (resultOfTable < startNumber*10)
            /*
            au depart condition etait <= mais cela provoquait un arret a 22 et non 20 : cela provoquait une boucle supplementaire vu que a 20 la
            condition etait toujours remplie
            */
        {
            //startNumber=startNumber*multiple; premiere ligne de commande écrite provoquant un resultat non escompté ! : startNumber etait de plus en plus grand

            resultOfTable=startNumber*multiple;
            System.out.println(resultOfTable);
            multiple++;
        } //25 mn de codage

        System.out.println("Exercice 6: Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu’à ce nombre." +
                " Par exemple, si l’on entre 5, le programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15");

        //creation d'une boucle : valeur du nombre de depart. incrementation + valeur Unitaire=valeur unitaire tant que valeurunitaire<valeur de base


        int unitaireValue=0;                                                    //declaration de la variable qui est comparée au nombre de depart
        int incrementation=0;                                                   //declaration de la variable qui enregistre la valeur calculée
        System.out.println("Quelle est le nombre de départ ?");
        int departNumber=keybordEntry.nextInt();
        while (unitaireValue < departNumber)                                    //comparaison de la valeur qui est comparee a la valeur butoire
              {
                  unitaireValue++;                                              //incrementation de la valeur a comparer
                  incrementation = incrementation + unitaireValue;              //calcul et mise en memoire de la valeur que l'on cherche
                  // unitaireValue++; a la premiere ecriture j'avais placé cette ligne apres la ligne suivante, provoquant un tour en moins.


              }
        System.out.println(incrementation);
        //codage en 45 minutes avec l'implementation des commentaires et la compréhension des erreurs. Rectifications des redondances des exercices 1 à 5.






             }
    }

