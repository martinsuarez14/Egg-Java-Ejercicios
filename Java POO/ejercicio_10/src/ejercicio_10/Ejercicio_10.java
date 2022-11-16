/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import Service.ArraysService;
import java.util.Arrays;
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
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArraysService as = new ArraysService();
        
        double[] vector1 = new double[50];
        double[] vector2 = new double[20];
        
        as.llenarV1(vector1);
        
        as.mostrarVector(vector1, 50);
        
        //Ordena de manera ascendente el array. 
        Arrays.sort(vector1);
        
        as.mostrarVector(vector1, 50);
        
        as.llenarV2(vector1, vector2);
        
        as.mostrarVector(vector2, 20);
    }
    
}
