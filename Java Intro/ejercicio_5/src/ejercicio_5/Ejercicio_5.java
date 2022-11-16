/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingrese un número entero:");;
        
        int num = leer.nextInt();
        
        System.out.println("DOBLE: " + num*2);
        System.out.println("TRIPLE: " + num*3);
        System.out.println("RAÍZ CUADRADA: " + Math.sqrt(num));
    }
    
}
