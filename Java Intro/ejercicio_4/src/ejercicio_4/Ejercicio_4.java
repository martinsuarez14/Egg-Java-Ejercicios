/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingrese la temperatura en °C;");
        
        double gradosC = leer.nextDouble();
        
        double gradosF = 32 + ( 9 * gradosC / 5);
        
        System.out.println(gradosC + "°C, son equivalentes a " + gradosF + "°F");
        
    }
    
}
