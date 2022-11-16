/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1");

        System.out.println("¿CUÁNTAS PERSONAS SON?");
        int cantidad = leer.nextInt();

        int contador = 0;
        
        System.out.println("Ingrese el nombre y la edad de cada persona: ");
          
        do {
            System.out.print("Nombre: ");
            String nombre = leer.next();
            
            System.out.print("Edad: ");
            int edad = leer.nextInt();
            
            mayorMenor(nombre, edad);
            
            System.out.println("¿Desea seguir ingresando nombres?");
            String op = leer.next();
            
            if (op.equals("N")){
                break;
            }
            
            contador = contador +1;
        } while (contador != cantidad);        
    }

    public static void mayorMenor(String nombre, int edad) {

        if (edad >= 18) {
            System.out.println("Nombre: " + nombre + "\n"
                    + "Edad: " + edad + "\n"
                    + "Mayor de edad.");
        } else {
            System.out.println("Nombre: " + nombre + "\n"
                    + "Edad: " + edad + "\n"
                    + "Menor de edad.");
        }
    }
}
