/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
       
        System.out.println("Ingrese dos números enteros:");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        boolean salir = false;
        
        do {       
        System.out.println("MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opción:");
        
        String test = leer.nextLine();
        System.out.print(test);
        
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1: 
                int suma = num1 + num2;
                System.out.println("RESULTADO: " + suma);
                break;
            case 2:
                int resta = num1 - num2;
                System.out.println("RESULTADO: " + resta);
                break;
            case 3:
                int mult = num1 * num2;
                System.out.println("RESULTADO: " + mult);
                break;
            case 4:
                
                if (num1 == 0 || num2 == 0){
                    System.out.println("No es posible la divissión por cero.");
                } else {
                    int div = num1 / num2;
                    System.out.println("RESULTADO: " + div);
                    break;
                }
                    break;                
            case 5:
                System.out.println("¿Está seguro que desea salir del programa(S/N)?");
                String op = leer.next();
                op= op.toUpperCase();
                if (op.equals("S")){
                    salir = true;
                    break;
                } else {
                    salir = false;
                }
                break;
                default:
                    System.out.println("Intente nuevamente");
                
        }
        
        } while (salir != true);
    }
    
}
