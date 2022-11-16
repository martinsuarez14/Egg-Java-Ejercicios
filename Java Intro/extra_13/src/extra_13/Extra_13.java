/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_13;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Extra_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
	int n = leer.nextInt();
        System.out.print("¿Cuántos valores?: ");
        
		
		//Creamos matriz
		int[][] escalera = new int[n][n];
		
		/*
		 * Llenamos matriz. Podemos empezar desde abajo
		 * con un bucle hasta n.
		 * Cada iteracion n se reduce hasta llegar a 0
		 * para así recorrer todas las filas desde n-1 hasta 0.
		 * Para recorrer las columnas usaremos otro varaible
		 * de un bucle for, que habrá que aumentar en 1 el valor
		 * de n en cada iteración para que recorra correctamente
		 * todas las columnas.
		 */
		
		while (n >= 0) {
			n--;
			
			for (int j = 0; j < n+1; j++)
				escalera[n][j] = j+1;
		}
		
		/*
		 * Mostramos la matriz.
		 * Evitaremos imprimir los valores 0
		 * que no han recibido valores.
		 * Esto dará sensación de escalera.
		 */
		
		
		for (int j = 0; j < escalera.length; j++) {
			for (int z = 0; z < escalera[0].length; z++)
				if (escalera[j][z] != 0)
					System.out.print(escalera[j][z]);
			
			System.out.println();
		}
		
		leer.close();           
    }    
}
    