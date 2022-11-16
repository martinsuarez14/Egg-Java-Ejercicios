/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingrese un tiempo en minutos: ");
        
        int minutos = leer.nextInt();
        
        tiempo(minutos);
        
    }
    
    public static void tiempo(int minutos){
        
        int horas = (int) (Math.floor(minutos/60));       
        
        int dias = (int) (Math.floor(horas/24));
        
        int count = 0;
        
        do {
            horas = horas - 24;
            count += 1;
            
        } while (horas > 24);
                  
        System.out.println(minutos + " minutos, equivalen a " + count + " días y " + horas + " horas. ");
        
    }
    
}
