/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
       
        System.out.println("Ingrese la palabra ¨eureka¨");
        
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }
    
}
