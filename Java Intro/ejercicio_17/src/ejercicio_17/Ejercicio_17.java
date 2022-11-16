/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_17;

import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingrese un número");
        
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            vector[i] = (int) (Math.random() * 100000);
            
            //System.out.println(vector[i]);          
            //DESCOMENTAR PARA VER LOS NÚMEROS
        }
        
        int uno = 0;
        int dos = 0;
        int tres = 0 ;
        int cuatro = 0;
        int cinco = 0;
        
        for (int i = 0; i < n; i++) {
            int x = 0;
            while (vector[i] != 0) {
                vector[i]= (int) floor(vector[i]/10);
                x += 1;
            }
            
            switch (x) {
                case 1: 
                    uno += 1;
                    break;
                case 2:
                    dos += 1;
                    break;
                case 3:
                    tres += 1;
                    break;
                case 4:
                    cuatro += 1;
                    break;
                case 5:
                    cinco +=1 ;
                    break;
            }
        }
        
        System.out.println("Hay " + uno + " números de 1 dígito.");
        System.out.println("Hay " + dos + " números de 2 dígitos.");
        System.out.println("Hay " + tres + " números de 3 dígitos.");
        System.out.println("Hay " + cuatro + " números de 4 dígitos.");
        System.out.println("Hay " + cinco + " números de 5 dígitos.");
        
    }
    
}
