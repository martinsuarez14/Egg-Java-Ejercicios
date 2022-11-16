/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
       
        System.out.println("Ingrese una palabra o frase que inicie con A");
        
        String frase = leer.nextLine();
        
        frase = frase.substring(0,1);
        
        frase = frase.toUpperCase();
        
        if (frase.equals("A")) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }
    
}
