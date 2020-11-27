import java.util.Scanner;
public class projet {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("BIENVENUE");
        System.out.println();
        System.out.println("pour une blague taper 1");
        System.out.println("pour une devinette taper 2");
        System.out.println("pour quitter taper 3");
        String reponse = input.nextLine();
        
        
         int n = Integer.parseInt(reponse);

       
        
        if (n==1)
        {System.out.println("Pourquoi toute les fermes sont silencieuse? parce qu'il LA FERME");}
        else if (n==2)
        {System.out.println("Qu'est ce qui a 13 coeurs mais aucun organe? UN JEU DE CARTE");}
        else 
        {System.out.println("Au revoir");}
        input.close(); 
    }

}
