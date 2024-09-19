import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         Afficher tous les nombres pairs en partant de 100 jusqu'à 11
         */

        // utilisation volontaire de int à la place de byte pour éviter des cast implicite lors des incrémentations
        int i = 100;
        while (i >= 11) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i--;
        }

        /*
         Calculer la somme des 10 premiers nombres qui sont des carrés
         */
        int sumSquare = 0;
        for(int j = 1; j <= 10; j++){
            sumSquare += j * j;
        }
        System.out.println(sumSquare);

        /* Créer un tableau de 100 cases de type booléen; initialisez chaque case à true;
        A partir de la 2è case, mettez à false toutes les cases qui sont un multiple de votre position actuelle;
        Avancez à la case suivante et répétez l'opération
         */

        boolean[] tabBool = new boolean[100];
        Arrays.fill(tabBool, true); // méthode qui remplit tous les éléments du tableau avec une valeur
        int k = 1;
        while ((2 * k) <= 100) {
            tabBool[(2 * k) - 1] = false;
            k++;
        }
        k = 1;
        while ((3 * k) <= 100) {
            tabBool[(3 * k) - 1] = false;
            k++;
        }

        /*
        Afficher les 100 premiers nombres premier à partir du nombre 50
         */
        int compteur = 0;
        int dividende = 50;
        while (compteur < 100){
            // Propriété math : si un nombre n'a pas de diviseur entre 2 et n ** 0.5, il n'en aura pas au-delà
            int diviseur_max = (int) Math.sqrt(dividende);
            for (int diviseur = 2; diviseur <= diviseur_max; diviseur++){
                // Inutile de faire toute la boucle si je trouve une diviseur entier et positif
                if ((dividende % diviseur) == 0){
                    break;
                }

                if (diviseur == diviseur_max){
                    compteur++;
                    System.out.println(dividende);
                }
            }
            dividende++;
        }

        /*
        Afficher les lettres de l'alphabet en majuscules à l'envers en sautant 1 lettre puis 2 puis 1 puis ..
         */

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean alternateur = true;
        for (int x = 25; x >= 0; x -= 2){
            System.out.println(alphabet.charAt(x));
            if (alternateur){
                alternateur = false;
            }
            else{
                alternateur = true;
                x--;
            }
        }

        /*
        Mettez toutes les lettres de l'alphabet en minuscule et en majuscule dans un tableau de 'char' en mettant
        1 minuscule puis 1 majuscule et ainsi de suite. Les minuscules de a à z, les majuscules de Z à A
         */
        char[] alphabetChar = new char[52];
        // utilisation de la variable alphabet du précédent exercice
        String alphabetMinus = alphabet.toLowerCase();
        for (int x = 0; x < 52; x += 2){
            alphabetChar[x] = alphabetMinus.charAt(x/2);
            alphabetChar[x+1] = alphabet.charAt(25 - (x/2));
        }

        }
    }
