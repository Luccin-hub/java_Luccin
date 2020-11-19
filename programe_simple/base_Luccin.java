import java.util.Scanner;
public class base_Luccin {
    public static void main(String[] args) 
    {
        String s = "45";
        int n = 3;
        double d = 3.14;

        n = Integer.parseInt(s);
        d = Double.parseDouble(s);


        n = (int) d;
        d = n;

        System.out.println(s);
        System.out.print(s);
        Scanner input = new Scanner(System.in);
        System.out.println("taper un nombre decimal");
        String getnum = input.nextLine();
        double num = Double.parseDouble(getnum); 
    }
}
