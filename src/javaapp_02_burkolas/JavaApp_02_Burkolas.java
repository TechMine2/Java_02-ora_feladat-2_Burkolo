package javaapp_02_burkolas;

import java.util.Scanner;

public class JavaApp_02_Burkolas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kérem adja meg a szoba szélességét (m): ");
        double szelesseg = sc.nextDouble();
        System.out.println("Kérem adja meg a szoba magasságot (m): ");
        double magassag = sc.nextDouble();
        
         double felulet = szelesseg * magassag; //cm
         double csempeFelulet = 20*20;
         
         long db = Math.round(felulet *100 *100 * 1.1 / csempeFelulet);
         
         String s = String.format("a %.2f m2 területű falfelületnek a csempézéséhez %d db csempe szükséges.", felulet, db);
         
         System.out.println(s);
    }
    
}
