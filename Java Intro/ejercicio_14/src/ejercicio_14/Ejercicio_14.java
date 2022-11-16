/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

import java.util.Scanner;
import sun.util.resources.cldr.nb.LocaleNames_nb;

/**
 *
 * @author Usuario
 */



public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("INGRESE LA CANTIDAD DE EUROS QUE POSEE");
        
        int euros = leer.nextInt();
        
        System.out.println("INGRESE LA MONEDA DE CAMBIO");
        
        String moneda = leer.next();
        
        conversorMoneda(euros, moneda);
        
    }
    
    public static void conversorMoneda (int euros, String moneda){
        
        double cambio = 0;
        
        if (moneda.equals("libras")){
            cambio = euros * 0.86;
            System.out.println(euros + " en " + moneda + " es igual a " + cambio + " euros.");
        } else if (moneda.equals("pesos")){
            cambio = euros * 1.28611;
            System.out.println(euros + " en " + moneda + " es igual a " + cambio + " euros.");
        } else if (moneda.equals("yenes")){
            cambio = euros * 129.852;
            System.out.println(euros + " en " + moneda + " es igual a " + cambio + " euros.");
        } else {
            System.out.println("la moneda ingresada no es correcta");
        }
        
        
        
    }
    
    
    
    
    
}
