/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("INGRESE LA CANTIDAD DE PERSONAS QUE SE MEDIRÁN");
        
        int n = leer.nextInt();
        int contador = 0;
        int contadorMen = 0;
        double alturasMenores = 0;
        double alturasMayores = 0;
        System.out.println("Ingrese las alturas de las personas!");
        do {
            
            double alturas = leer.nextDouble();
            
            if (alturas < 1.60){
                alturasMenores = alturasMenores + alturas;
                contadorMen += 1;
                contador += 1;
            } else {
                alturasMayores = alturasMayores + alturas;
                contador += 1;
            }            
        } while (contador < n);
        
        double promedioBajitos = alturasMenores / contadorMen;
        double promedioTotal = (alturasMayores + alturasMenores) / (contador + contadorMen);
        
        System.out.println("PROMEDIO ALTURAS MENORES A 1.60 M:  " + promedioBajitos);       
        System.out.println("PROMEDIO ALTURAS TOTALES: " + promedioTotal);
    }    
}
