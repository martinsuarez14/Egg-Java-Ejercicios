/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_18;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");

        System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
                 
        for (int i = 0; i < n; i++) {
            vector[i]=leer.nextInt();
        }
        
        int total = sumaVector(vector, n);
        
        System.out.println("LA SUMA DEL VECTOR ES: " + total);
        
    }
    public static int sumaVector(int[] vec, int n){
        
        int suma = 0;
        
        for (int i = 0; i < n; i++) {
            suma = suma + vec[i];
        }
        return suma;
    }
    
}
