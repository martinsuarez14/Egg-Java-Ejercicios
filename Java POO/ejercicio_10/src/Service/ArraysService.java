/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArraysService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Llena el vector1 con numeros reales aleatorios.
     * @param v1 
     */
    public void llenarV1(double[] v1){
        
        for (int i = 0; i < 50; i++) {
            v1[i] = (double) (Math.random() * 100);
        }
        System.out.println("--------");
    }
    /**
     * Muestra el vector en pantallar
     * @param vector
     * @param largo 
     */
    public void mostrarVector(double[] vector, int largo){
        
        for (int i = 0; i < largo; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("--------");
    }
    /**
     * Llenar el vector2 con los 10 primeros del vector1 y lo demás con 0,5
     * @param v1
     * @param v2 
     */
    public void llenarV2(double[] v1, double[] v2){
        
        for (int i = 0; i < 10; i++) {
            v2[i] = v1[i];
        }
        for (int i = 10; i < 20; i++) {
            v2[i] = 0.5;
        }
    }
    
    
    
    
    
    
}
