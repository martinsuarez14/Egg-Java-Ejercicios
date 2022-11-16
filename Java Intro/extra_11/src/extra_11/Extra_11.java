/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("INGRESE UN NÚMERO PARA SABER CUÁNTOS DÍGITOS TIENE");
    
        int num = leer.nextInt();
        
        int resultado = calcularDigitos(num);
        
        System.out.println("EL NÚMERO INGRESADO TIENE " + resultado + " DÍGITOS.");        
    }
    
    public static int calcularDigitos(int n) {
        
        int digitos = 0;
        
        while (n > 10) {
            n = n/10;
            digitos += 1;
        }        
        if (n<10){
            digitos += 1;
        }                
        return digitos;
        
    }       
    
}
