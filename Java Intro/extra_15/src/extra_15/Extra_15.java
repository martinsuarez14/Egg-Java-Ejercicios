/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_15;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
                
        int op;
        boolean salir = false;
        
        do {
            System.out.println("INGRESE DOS VALORES: ");
            
            int num1 = leer.nextInt();            
            int num2 = leer.nextInt();            
            
            System.out.println("MENÚ \n"
                    + "1. SUMAR \n"
                    + "2. RESTAR \n"
                    + "3. MULTIPLICAR \n"
                    + "4. DIVIDIR \n"
                    + "5. SALIR");
            
            op = leer.nextInt();
            
            if (op == 1){
                int resultado = suma(num1, num2);
                System.out.println("El Resultado es: " + resultado);
            } else if (op == 2){
                int resultado = resta(num1, num2);
                System.out.println("El Resultado es: " + resultado);
            } else if (op == 3){
                int resultado = multiplicacion(num1, num2);
                System.out.println("El Resultado es: " + resultado);
            } else if (op == 4){
                double resultado = division(num1, num2);
                System.out.println("El Resultado es: " + resultado);
            } else if (op == 5){
                salir = true;
            }            
            
        } while (salir == false);        
        
    }
    
    public static int suma(int n1, int n2){
        
        int res = n1 + n2;
        
        return res;
    }
    public static int resta(int n1, int n2){
        
        int res = n1 - n2;
        
        return res;
    }
    public static int multiplicacion(int n1, int n2){
        
        int res = n1 + n2;
        
        return res;
    }
    public static double division(int n1, int n2){
        
        int res = n1 / n2;
        
        return res;
    }
}
