
package podminka.pkgif;

import java.util.Scanner;


public class PodminkaIF {

   
    public static void main(String[] args) {
        //uživatel zadává hodnotu 
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadej číslo a: ");
        int a = vstup.nextInt (); 
        System.out.println("Zadej číslo b: ");
        int b = vstup.nextInt ();
        
        //podmínka
        if (a < b) { 
            //swaperíno
            int pomocná = a;
            a = b;
            b = pomocná;
        }
         System.out.println("čísla podle pořadí: "+a+" "+b);   
    }
        
}
