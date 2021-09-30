/*
 * Licence info
 * This code is part of free software
 */

package cv01.kralovcova;

import java.util.Scanner;

/**
 *
 * @author Jirina
 */
public class InterakceSUzivatelem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nacteni hodnot od uzivatele");
        
        System.out.println("");
        System.out.print("Zadej cele cislo: ");
        int celeCislo = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Bylo zadano cislo: ");
        System.out.println(celeCislo);
        
        System.out.println("");
        System.out.print("Zadej realne cislo: ");
        float realneCislo = sc.nextFloat();
        sc.nextLine();
        System.out.format("Bylo zadano cislo: %1.3f%n", realneCislo);
        
        System.out.println("");
        System.out.print("Zadej slovo: ");
        String slovo = sc.next();
        sc.nextLine();
        System.out.println("Bylo nacteno: " + slovo);
        
        System.out.println("");
        System.out.println("Nactu delsi text: ");
        String veta = sc.nextLine();
        System.out.println("Zadana veta: " );
        System.out.println("--" + veta + "--");
        System.out.println("");
        
        System.out.println("To je vse!");
        System.out.println("Koncim!");
    }

}
