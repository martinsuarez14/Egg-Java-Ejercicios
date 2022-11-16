/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        System.out.println("INGRESA LA LONGITUD DEL CUADRADO");
        int num = leer.nextInt();
                
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                
                if  (i == 0 || i == num - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == num -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            
            System.out.println("");
        }
       
    }
    
}
