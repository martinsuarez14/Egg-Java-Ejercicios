/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoAMotor;
import Entidad.Velero;
import Entidad.YateDeLujo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlquileresServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {

        boolean flagMenu = true;

        while (flagMenu) {

            System.out.println("*** MENÚ ALQUILER DE BARCOS ***\n"
                    + "1. Alquilar Barco \n"
                    + "2. Calcular Precio de Alquiler\n"
                    + "3. Salir");

            int opcionMenu = leer.nextInt();

            if (opcionMenu == 1) {

                System.out.println("*** ALQUILAR BARCO ***\n"
                        + "¿Qué tipo de barco desea alquilar?\n"
                        + "1. Común\n"
                        + "2. Velero\n"
                        + "3. Barco a Motor\n"
                        + "4. Yate de Lujo\n"
                        + "5. Volver al menú anterior");

            } else if (opcionMenu == 2) {

                boolean flagCalcularAlquiler = true;

                while (flagCalcularAlquiler) {

                    System.out.println("*** CALCULAR PRECIO DE ALQUILER ***\n"
                            + "¿Qué tipo de barco desea alquilar?\n"
                            + "1. Común\n"
                            + "2. Velero\n"
                            + "3. Barco a Motor\n"
                            + "4. Yate de Lujo\n"
                            + "5. Volver al menú anterior");
                    int opcionBarcoAlquiler = leer.nextInt();

                    switch (opcionBarcoAlquiler) {
                        case 1:
                            System.out.println("");
                            System.out.println("* ALQUILAR BARCO *");
                            calcularPrecioBarcoComun();
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println("* ALQUILAR VELERO *");
                            calcularPrecioVelero();
                            break;
                        case 3:
                            System.out.println("");
                            System.out.println("* ALQUILAR BARCO A MOTOR *");
                            calcularPrecioBarcoCV();
                            break;
                        case 4:
                            System.out.println("");
                            System.out.println("* ALQUILAR YATE DE LUJO *");
                            calcularPrecioYate();
                            break;
                        case 5:
                            flagCalcularAlquiler = false;
                            break;
                        default:
                            System.out.println("Ingrese una opción correcta.");
                    }
                }

            } else if (opcionMenu == 3) {
                System.out.println("¡GRACIAS! Hasta Pronto.");
                flagMenu = false;
            } else {
                System.out.println("Ingrese una opción correcta.");
            }
        }
    }

    public void calcularPrecioBarcoComun() {

        Barco b1 = new Barco(24);

        System.out.println("Ingrese la fecha de inicio de alquiler: ");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("año");
        int anio = leer.nextInt();

        Date fechaInicio = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Ingrese la fecha de finalización de alquiler: ");
        System.out.println("dia");
        int diaD = leer.nextInt();
        System.out.println("mes");
        int mesD = leer.nextInt();
        System.out.println("año");
        int anioD = leer.nextInt();

        Date fechaFin = new Date(anioD - 1900, mesD - 1, diaD);

        Alquiler a1 = new Alquiler(fechaInicio, fechaFin, b1);

        System.out.println("El precio de alquiler de un Barco Común de 24 mts de eslora es de $" + a1.precioDelAlquiler(b1));

    }

    public void calcularPrecioVelero() {

        Barco b1 = new Velero(2, 30);

        System.out.println("Ingrese la fecha de inicio de alquiler: ");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("año");
        int anio = leer.nextInt();

        Date fechaInicio = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Ingrese la fecha de finalización de alquiler: ");
        System.out.println("dia");
        int diaD = leer.nextInt();
        System.out.println("mes");
        int mesD = leer.nextInt();
        System.out.println("año");
        int anioD = leer.nextInt();

        Date fechaFin = new Date(anioD - 1900, mesD - 1, diaD);

        Alquiler a1 = new Alquiler(fechaInicio, fechaFin, b1);

        System.out.println("El precio de alquiler de un Velero de 30 mts de eslora y 2 velas es de $" + a1.precioDelAlquiler(b1));
    }

    public void calcularPrecioBarcoCV() {
        Barco b1 = new BarcoAMotor(300000, 40);

        System.out.println("Ingrese la fecha de inicio de alquiler: ");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("año");
        int anio = leer.nextInt();

        Date fechaInicio = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Ingrese la fecha de finalización de alquiler: ");
        System.out.println("dia");
        int diaD = leer.nextInt();
        System.out.println("mes");
        int mesD = leer.nextInt();
        System.out.println("año");
        int anioD = leer.nextInt();

        Date fechaFin = new Date(anioD - 1900, mesD - 1, diaD);

        Alquiler a1 = new Alquiler(fechaInicio, fechaFin, b1);

        System.out.println("El precio de alquiler de un Barco a motor de 40 mts de eslora y 30.000 CV es de $" + a1.precioDelAlquiler(b1));
    }

    public void calcularPrecioYate() {

        Barco b1 = new YateDeLujo(12, 32000, 60);

        System.out.println("Ingrese la fecha de inicio de alquiler: ");
        System.out.println("dia");
        int dia = leer.nextInt();
        System.out.println("mes");
        int mes = leer.nextInt();
        System.out.println("año");
        int anio = leer.nextInt();

        Date fechaInicio = new Date(anio - 1900, mes - 1, dia);

        System.out.println("Ingrese la fecha de finalización de alquiler: ");
        System.out.println("dia");
        int diaD = leer.nextInt();
        System.out.println("mes");
        int mesD = leer.nextInt();
        System.out.println("año");
        int anioD = leer.nextInt();

        Date fechaFin = new Date(anioD - 1900, mesD - 1, diaD);

        Alquiler a1 = new Alquiler(fechaInicio, fechaFin, b1);

        System.out.println("El precio de alquiler de un Yate de Lujo de 60 mts de eslora, 32.000 CV y 12 camarotes es de $" + a1.precioDelAlquiler(b1));
    }
}
