/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_9;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("INGRESE 2 NÚMEROS PARA DIVIDIR: ");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        divisiones(num1, num2);
        
    }
    public static void divisiones(int n1, int n2){
        
        int cociente = 0;
        int residuo = 0;
        int resta = n1;
        
        do {            
            resta = resta - n2;
            cociente += 1;            
            
            if (resta < n2) {
                residuo = resta;
            }
        } while (resta >= n2);
        
        System.out.println(n1 + " dividido " + n2 + " es de cociente " + cociente + " y de resto " + residuo);
    }
}
