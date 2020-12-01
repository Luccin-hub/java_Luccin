/*  Par: Luccin Pierre Mutabazi, mutluc18@ecolecatholique.ca 
    2020-11-27
*/

// Au début du fichier, avant la déclaration de classe...
// importer la définition de l'objet Scanner 
import java.util.Scanner;
public class projet {
    public static void main(String[] args) {

        luccinpasdeparametres();// appel de la fonction luccinpasdeparametres
        while(true)//condition while, retourne au début a la fin du jeu
        {
//---------Entrée a la console ------------------------------------------
// Tu dois créer un objet de type Scanner

        // System.in 
        // est la console définit par ton système d'exploitation
        Scanner input = new Scanner(System.in);
//----------------------------------------------------------------------------------
//------Sortie de la console-------------------------------------------------------------
// Sysout est la console définit par ton système d'exploitation 
        System.out.println("BIENVENUE");
        System.out.println();
        System.out.println("pour une blague taper 1");
        System.out.println("pour une devinette taper 2");
        System.out.println("pour quitter taper 3");
        String reponse = input.next();// Saisir le texte entré avec la méthode .nextLine()
         int n = Integer.parseInt(reponse);
       //Conversion de type(texte--->nombre)
//-------------------------------------------------------------------------
//  Condition if, else if, else, donne la réponse a l'utilisateur depandant de ce qu'il a rentré
        if (n==1)
        {System.out.println("Pourquoi toute les fermes sont silencieuse? parce qu'il LA FERME");}//sorti de la réponse 1
        else if (n==2)
        {System.out.println("Qu'est ce qui a 13 coeurs mais aucun organe? UN JEU DE CARTE");}//sorti de la réponse 2
        else 
        {System.out.println("Au revoir");break;}//l'utilisateur quitte le jeu
        input.close();
        // fermer le Scanner qui observe la console / System.in
        
        }
        
        
    }
static void luccinpasdeparametres()
    {
        System.out.println();
    }

   

}
