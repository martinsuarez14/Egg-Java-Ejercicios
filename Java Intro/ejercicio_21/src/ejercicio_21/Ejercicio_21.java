/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_21;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        int[][] matrizGrande = new int[10][10];
        int[][] matrizPeque = new int[3][3];
        
        matrizPeque[0][0] = 36;
        matrizPeque[0][1] = 5;
        matrizPeque[0][2] = 67;
        matrizPeque[1][0] = 89;
        matrizPeque[1][1] = 90;
        matrizPeque[1][2] = 75;
        matrizPeque[2][0] = 14;
        matrizPeque[2][1] = 22;
        matrizPeque[2][2] = 26;
        
        
        
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {                                            
                   matrizGrande[i][j] = (int) (Math.random() * 100);             
                if (matrizGrande[i][j] == matrizGrande[4][4]){
                    matrizGrande[i][j] = 36;
                } else if (matrizGrande[i][j] == matrizGrande[4][5]) {
                    matrizGrande[i][j] = 5;
                } else if (matrizGrande[i][j] == matrizGrande[4][6]){
                    matrizGrande[i][j] = 67;
                } else if (matrizGrande[i][j] == matrizGrande[5][4]) {
                    matrizGrande[i][j] = 89;
                } else if (matrizGrande[i][j] == matrizGrande[5][5]){
                    matrizGrande[i][j] = 90;
                } else if (matrizGrande[i][j] == matrizGrande[5][6]){
                    matrizGrande[i][j] = 75;
                } else if (matrizGrande[i][j] == matrizGrande[6][4]){
                    matrizGrande[i][j] = 14;
                } else if (matrizGrande[i][j] == matrizGrande[6][5]){
                    matrizGrande[i][j] = 22;
                } else if (matrizGrande[i][j] == matrizGrande[6][6]){
                    matrizGrande[i][j] = 26;
                }
                System.out.print(matrizGrande[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("___________________");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizPeque[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("___________________");
        
        
        int coincidencias = 0;
        
        
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {                
                
                if (matrizGrande[i][j] == matrizPeque[0][0] && matrizGrande[i][j+1] == matrizPeque[0][1] && matrizGrande[i][j+2] == matrizPeque[0][2] && matrizGrande[i+1][j] == matrizPeque[1][0] && matrizGrande[i+1][j+1] == matrizPeque[1][1] && matrizGrande[i+1][j+2] == matrizPeque[1][2] && matrizGrande[i+2][j] == matrizPeque[2][0] && matrizGrande[i+2][j+1] == matrizPeque[2][1] && matrizGrande[i+2][j+2] == matrizPeque[2][2]){
                    //coincidencias = coincidencias + 1;
            coincidencias = 9;
        }
                
            }
        }
        
        System.out.println("COINCIDENCIAS: " + coincidencias);
        
        if (coincidencias == 9){
            System.out.println("ENCONTRASTE UNA MATRIZ OCULTA!!");
        }
        
        
    }
    
}
