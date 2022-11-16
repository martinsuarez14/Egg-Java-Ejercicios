/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        System.out.println("Día: " + fecha.getDate()+ "\n"
                + "Mes: " + fecha.getMonth() + "\n"
                + "Año: " + fecha.getYear());

        Date fechaActual = new Date();
        System.out.println(fechaActual);

        int años = fechaActual.getYear() - (fecha.getYear()-1900);
        int meses = fechaActual.getMonth() - (fecha.getMonth()-1);
        System.out.println("Pasaron " + años + " años y " + meses + " meses.");
    }

}
