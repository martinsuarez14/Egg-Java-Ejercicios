/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_5 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Ingrese su plan");
        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();

        switch (opcion) {
            case "A":
                System.out.println("El costo del tratamiento es = " + (costo / 2));
                break;
            case "B":
                System.out.println("El costo del tratamiento es = " + (costo - ( costo * 0.35)));
                break;
            case "C":
                System.out.println("Su plan no posee descuento. Debe abonar = " + costo);
                break;
                default:
                    System.out.println("El plan ingresado no es válido");

        }
    }

    
}
