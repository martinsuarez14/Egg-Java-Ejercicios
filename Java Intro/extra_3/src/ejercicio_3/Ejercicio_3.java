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
        
         System.out.println("INGRESE UNA LETRA: ");
         
         String letra = "";
                          
         while (!letra.equals("XXX")) {
             
             letra = leer.nextLine();         
             letra = letra.toUpperCase();
             
             if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
             System.out.println("La letra ingresada es una vocal!");
             } else {
             System.out.println("La letra ingresada no es una vocal, es una CONSONANTE!");
             }             
             
         }       
                
    }    
}
