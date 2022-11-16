/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_1;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Cancion c1 = new Cancion();
        System.out.println("Ingrese el título de la canción: ");
        c1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la canción: ");

        c1.setAutor(leer.nextLine());

        System.out.println(c1);

    }

}
