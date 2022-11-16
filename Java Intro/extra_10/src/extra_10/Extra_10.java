/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("ADIVINE EL RESULTADO DE LA MULTIPLICACIÓN!");
    
        boolean salir;
        String op;
        int resultado = aleatorio();
        
        do {           
            System.out.println("¿Qué número es?");
            
            int respuesta = leer.nextInt();
            
            if (respuesta == resultado) {
                System.out.println("GANASTE!!!");
                System.out.println("¿Deseas jugar otra vez? S/N");
                op = leer.next();
                op = op.toUpperCase();
                              
                if (op.equals("S")){
                    salir = false;
                    aleatorio();
                } else {
                    salir = true;
                }
            } else {
                System.out.println("PERDISTE :(");
                System.out.println("¿Deseas jugar otra vez?"); 
                op = leer.next();
                op = op.toUpperCase();
                
                if (op.equals("S")){
                    salir = false;
                } else {
                    salir = true;
                }               
            }            
        } while (salir != true);        
    }
    
    public static int aleatorio(){
        
        int num1 = (int) (Math.random() * 10);
        
        int num2 = (int) (Math.random() * 10);
        
        int n = num1 * num2;
        
        return n;
    }
    
}
