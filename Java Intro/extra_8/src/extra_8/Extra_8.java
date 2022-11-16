/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("INGRESE NÚMERO ENTEROS");
        
        int num;
        int pares = 0;
        int impares = 0;
        int cantidad = 0;
        
        
        do {
            num = leer.nextInt();
            
            if ((num % 5) == 0) {
                break;
            } else if ((num % 2) == 0) {
                pares += 1;
                cantidad += 1;
            } else {
                impares += 1;
                cantidad += 1;
            }
            
        } while ((num % 5) != 0);

        
        System.out.println("NÚMEROS INGRESADOS: " + cantidad);
        System.out.println("PARES: " + pares);
        System.out.println("IMPARES: " + impares);
    }    
    
}
