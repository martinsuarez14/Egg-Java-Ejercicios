/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in, "ISO-8859-1");
       
        System.out.println("Ingrese un número entero:");
        
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            
            System.out.println( num + " es par!");
        } else {
            System.out.println( num + " es impar!");
        }
    }
}