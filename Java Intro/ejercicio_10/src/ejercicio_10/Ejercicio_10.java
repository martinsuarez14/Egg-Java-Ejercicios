/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
       
        System.out.println("Ingrese un valor límite");
        int limite = leer.nextInt();
        
        int suma = 0;
        
        while (suma <= limite){
            int num = leer.nextInt();
            suma += num;
            
        }
        
        System.out.println("La sumatoria es: " + suma);
    }
    
}
