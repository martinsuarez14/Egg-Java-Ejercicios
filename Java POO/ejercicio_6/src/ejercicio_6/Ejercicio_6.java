/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import Entidad.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CafeteraService cafeService = new CafeteraService();

        boolean flag = true;

        while (flag) {

            System.out.println("--------- \n"
                    + "MENÚ\n"
                    + "1. Capacidad Máxima \n"
                    + "2. Llenar Cafetera \n"
                    + "3. Servir taza \n"
                    + "4. Vaciar Cafetera \n"
                    + "5. Rellenar Cafetera\n"
                    + "6. Salir");
            System.out.println("----------");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafeService.capacidadMax();
                    break;
                case 2:
                    cafeService.llenarCafetera();
                    System.out.println("Su cafetera se llenó correctamente.");
                    break;
                case 3:
                    cafeService.servirTaza();
                    System.out.println("Su cafetera tiene ");
                    break;
                case 4:
                    cafeService.vaciarCafetera();
                    System.out.println("Su cafetera se vació.");
                    break;
                case 5:
                    cafeService.agregarCafe();
                    System.out.println("Su cafetera se llenó de café nuevamente.");
                    break;
                case 6:
                    flag = false;
            }

        }

    }

}
