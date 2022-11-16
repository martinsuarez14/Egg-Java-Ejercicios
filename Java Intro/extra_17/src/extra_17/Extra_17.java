/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1");

        System.out.print("Ingrese un valor para saber si es primo: ");
        int num = leer.nextInt();

        primos(num);
        
    }

    public static void primos(int n) {

        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                contador++;
            }
        }
        
        if (contador != 2){
            System.out.println("NO ES PRIMO");
        } else {
            System.out.println("ES PRIMO");;
        }        
    }
}
