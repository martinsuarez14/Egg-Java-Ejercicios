/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Tamaño del vector");
        
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*10);
            //System.out.println(vector[i]); 
            //DESCOMENTAR PARA VER LOS NÚMEROS.
        }
        System.out.println("¿Qué número deseas buscar?");
        
        int buscar = leer.nextInt();
        int iguales = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar){
                System.out.println("se encontró en la posicion: " + i);
                iguales++;
            }
            
        }
        if (iguales>1){
            System.out.println("Está repetido " + iguales + " veces");
        }
    }   
    
    
}
