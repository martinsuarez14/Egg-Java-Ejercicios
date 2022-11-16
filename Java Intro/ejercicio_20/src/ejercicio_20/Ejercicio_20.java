/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_20;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        int[][] matriz = new int [3][3];
        
        /*matriz[0][0] = 2 ;
        matriz[0][1] = 7 ;
        matriz[0][2] = 6 ;
        matriz[1][0] = 9 ;
        matriz[1][1] = 5 ;
        matriz[1][2] = 1 ;
        matriz[2][0] = 4 ;
        matriz[2][1] = 3 ;
        matriz[2][2] = 8 ;
        */
        
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la posición " + i + " " + j);
                int num = leer.nextInt();
                matriz[i][j] = num;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        int magico = 0;
        
        /*if (matriz[0][0] + matriz[1][0] + matriz[2][0] == 15){
            magico += 1;
            if 
        }*/
        int[] top = new int[3];
        int[] mid = new int[3];
        int[] bot = new int[3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
                          
                if (i == 0){
                    top[j] = matriz[i][j];                    
                } else if (i == 1) {
                    mid[j] = matriz[i][j];
                } else {
                    bot[j] = matriz[i][j];
                }              
                               
            }
        }
        
        /*for (int i = 0; i < 3; i++) {
            System.out.print(top[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            System.out.print(mid[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            System.out.print(bot[i]);
        }*/
        //DESCOMENTAR PARA VER LOS NÚMERO ALMACENADOS EN LOS VECTORES!
        
        
        System.out.println("");
            int sumaTop = 0;
            int sumaMid = 0;
            int sumaBot = 0;
            for (int i = 0; i < 3; i++) {
            
            sumaTop = sumaTop + top[i];
            sumaMid = sumaMid + mid[i];
            sumaBot= sumaBot + bot[i];
            
            if (sumaTop == 15 && sumaMid == 15 && sumaBot ==15){
                System.out.println("ES UN CUBO MÁGICO!!!");
            }
        }     
        
    }
    
}
