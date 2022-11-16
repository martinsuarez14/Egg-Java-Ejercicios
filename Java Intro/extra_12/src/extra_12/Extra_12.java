/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.*/
        Scanner leer = new Scanner(System.in, "ISO-8859-1");

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
                
        //System.out.println(cont1 + "-" + cont2 + "-" + cont3);

        /*while (cont3 != 9) {

            if (cont3 == 3) {
                String numCadena = String.valueOf(cont3);
                numCadena = "E";
                System.out.println(cont1 + "-" + cont2 + "-" + numCadena);
             
                //cont3 = Integer.parseInt(numCadena);
                //cont3 = 3;
            } else {

                cont3 = cont3 + 1;
                System.out.println(cont1 + "-" + cont2 + "-" + cont3);
            }
        }*/
        //int numEntero = 4;    
        //String numCadena= String.valueOf(numEntero); 

        //String numCadena = "1";      
        //int numEntero = Integer.parseInt(numCadena);
        System.out.println(cont1 + "-" + cont2 + "-" + cont3);
        for (int i = 0; i < 10; i++) {
            cont3 = cont3 + 1;
            System.out.println(cont3);
            if (cont3 == 3){
                String numCadena = String.valueOf(cont3);
                System.out.println(cont1 + "-" + cont2 + "-" + numCadena);
                
                
            } 
            
        }
        
    }

}
