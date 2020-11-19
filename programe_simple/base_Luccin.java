/*  Par: Luccin Pierre Mutabazi, mutluc18@ecolecatholique.ca 
    2020-11-18
*/

// Au début du fichier, avant la déclaration de classe...
// importer la définition de l'objet Scanner 
import java.util.Scanner;
/** Exemples sur les types et les entrées et sorties au console */
public class base_Luccin {
    public static void main(String[] args) 
    {
        //----------TYPES DE DONNÉES----------//

        // Il faut déclarer le TYPE des variables
        // Format : <type> <nom> = <valeur assignée>;

        String s = "100";// texte -> usage général
        int n = 3;// nombres entiers -> pour compter
        double d = 3.14;// nombres décimaux -> pour les calculs

        // conversions de type (texte -> nombre)
        n = Integer.parseInt(s);
        d = Double.parseDouble(s);
        // casting entre types numériques
        n = (int) d;
        d = n;
//-----------SORTIE À LA CONSOLE-----------//
        
        // System.out 
        // est la console définit par ton système d'exploitation

        // .println() ajoute automatiquement un retour de ligne
        System.out.println(s);
        System.out.println(s);
         //-----------ENTRÉES À LA CONSOLE------------//

        // Tu dois créer un objet de type Scanner

        // System.in 
        // est la console définit par ton système d'exploitation
        Scanner input = new Scanner(System.in);
        // Indiquer à l'utilisateur d'entrer quelque chose
        System.out.println("taper un nombre décimal");
        // Saisir le texte entré avec la méthode .nextLine()
        String getnum = input.nextLine();
        // Convertir le texte capté en valeur numérique (de type double)
        // --> cette étape peut générer une erreur si le texte n'a pas 
        //     le format approprié
        double num = Double.parseDouble(getnum);
        // Confirmer le résultat avec un message à la console
        System.out.println("Tu as inscrit le nombre " + num);
        // À la fin de la méthode main()...
        // fermer/tuer le Scanner qui observe la console / System.in
        input.close(); 
    }
}
