/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1");

        System.out.println("INGRESE EL TAMAÑO DE LOS VECTORES");
        int n = leer.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 20);
            vector2[i] = (int) (Math.random() * 20);
        }
        
        comprobacion(vector1, vector2, n);

    }

    public static void comprobacion(int[] vec1, int[] vec2, int n) {

        int x = 0;

        for (int i = 0; i < n; i++) {

            if (vec1[i] == vec2[i]) {
                x++;
            } else {
                break;
            }
        }
        if (x == n) {
            System.out.println("ÁMBOS VECTORES SON IGUALES");
        } else {
            System.out.println("LOS VECTORES NO COINCIDEN");
        }
    }
}
