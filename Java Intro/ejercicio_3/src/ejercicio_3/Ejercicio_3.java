/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingresa una frase:");
        
        String frase = leer.nextLine();
        
        System.out.println("");
        System.out.println(frase.toUpperCase());
        System.out.println("");
        System.out.println(frase.toLowerCase());
    }
    
}
