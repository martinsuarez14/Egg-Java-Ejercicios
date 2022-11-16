/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("INGRESE LA CANTIDAD DE FAMILIAS");
        
        int familias = leer.nextInt();
        int[] vector = new int[familias];
        
        for (int i = 0; i < familias; i++) {
            System.out.println("¿Cuántos hijos tiene?");
            vector[i] = leer.nextInt();
        }
        
        for (int i = 0; i < familias; i++) {
            System.out.println(vector[i]);
        }
        
        double resultado = promedioHijos(vector, familias);
        
        System.out.println("EL PROMEDIO DE HIJOS POR FAMILIAS ES: " + resultado);

    }
    
    public static double promedioHijos(int[] v, int fam){
        
        int suma = 0;
        
        for (int i = 0; i < fam; i++) {
            suma = suma + v[i];
        }        
        double prom = suma / fam;        
        return prom;
    }
    
}
