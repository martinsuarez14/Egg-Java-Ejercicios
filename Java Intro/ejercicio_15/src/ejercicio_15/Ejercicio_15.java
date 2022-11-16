/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
               
        int[] vector;
        vector = new int[100];
        
        int relleno = 0;
        
        for (int i = 0; i < 100; i++) {
            vector[i] = relleno;
            relleno++;
        }           
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
     
    }
    
}
