/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pole;

import java.util.Scanner;

/**
 *
 * @author david.lukes1
 */
public class Pole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] pole = new int[3];

        Scanner vstup = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("zadej " + (+i + 1) + ". číslo: ");
            pole[i] = vstup.nextInt();
        }
        
        if (pole[0] > pole[1]) {
            int pom = pole [0];
            pole [0] = pole [1];
            pole [1] = pom;
        }
        if (pole[1] > pole[2]) {
            int pom = pole [1];
            pole [1] = pole [2];
            pole [2] = pom;
        }
        if (pole[0] > pole[1]) {
            int pom = pole [0];
            pole [0] = pole [1];
            pole [1] = pom;
        }
        System.out.println("seřazení: "+pole[0]+" "+pole[1]+" "+pole[2]);
    

  
        
        // TODO code application logic here
    }
    
}
