/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_7;

import com.sun.media.jfxmediaimpl.platform.java.JavaPlatform;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("¿CUÁNTOS NÚMEROS DESEA INGRESAR?");
        int num = leer.nextInt();
        int contador = 0;
        double valores;
        double suma = 0;
        double numMax = 0;
        double numMin = 0;
        
        /*while (contador < num){
            
            System.out.print("Dame el valor: ");
            System.out.println("");
            valores = leer.nextInt();
            suma = suma + valores;
            contador += 1;
            if (valores > numMax && numMin == 0){
                numMax = valores;
                numMin = valores;
            } else if (valores < numMin) {
                numMin = valores;
            }            
        }*/
        
        do {
            System.out.print("Dame el valor: ");
            System.out.println("");
            valores = leer.nextInt();
            suma = suma + valores;
            contador += 1;
            if (valores > numMax && numMin == 0){
                numMax = valores;
                numMin = valores;
            } else if (valores < numMin) {
                numMin = valores;
            } 
        } while (contador < num);
        
        double promedio = suma / contador;
        System.out.println("");
        System.out.println("EL VALOR MÍNIMO INGRESADO ES: " + numMin);
        System.out.println("EL VALOR MÁXIMO INGRESADO ES: " + numMax);
        System.out.println("EL PROMEDIO DE TODOS LOS VALORES ES: " + promedio);
        
    }
    
}
