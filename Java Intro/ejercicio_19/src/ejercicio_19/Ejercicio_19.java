/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingrese el tamaño de la matriz n * n");
        int n = leer.nextInt();
             
        int[][] matriz = new int[n][n];
        int[][] transpuesta = new int [n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 5);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[i][j] = matriz[j][i]*(-1);
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println("");
        }
        int coincidencias = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (matriz[j][i]*(-1) == transpuesta[i][j]) {
                    coincidencias += 1;
                }
                
            }
            System.out.println("");
        }
        System.out.println(coincidencias);
        if (coincidencias == 9){
            System.out.println("LA MATRIZ A ES OPUESTA A B");
        }
       
    }
    
}
