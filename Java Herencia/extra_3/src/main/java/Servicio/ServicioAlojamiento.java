/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.AlojamientoExtraHotelero;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4;
import Entidad.Hotel5;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioAlojamiento {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    List<Alojamiento> alojamientos = new ArrayList<>();
    List<Hotel> hoteles = new ArrayList<>();
    List<AlojamientoExtraHotelero> alojamientosExtraHoteleros = new ArrayList();

    public void crearResidencias() {

        Hotel h1 = new Hotel4('B', "Rogelio Restó", 30, 15, 30, 4, "Hotel San Martin", "Mitre 860", "Reconquista", "Fernendo");
        Hotel h2 = new Hotel5(3, 5, 2, 'A', "Américas", 60, 40, 100, 8, "Hotel Center", "Obligado 890", "Reconquista", "El Rabino");
        Hotel h3 = new Hotel5(3, 5, 2, 'B', "Santo Domingo", 60, 40, 100, 8, "Hotel Center", "Obligado 890", "Reconquista", "El Rabino");

        AlojamientoExtraHotelero a1 = new Camping(50, 5, 200, "Camping Arenas Blancas", "Malabrigo", "Malabrigo", "Algún Wacho"); 
        ((Camping) a1).setRestaurante(true);

        AlojamientoExtraHotelero a2 = new Residencia(15, 80, "UPCN", "Santa Fe", "Santa Fe", "Algún Gremialista");
        AlojamientoExtraHotelero a3 = new Residencia(15, 80, "ATE", "Santa Fe", "Santa Fe", "Algún Gremialista");

        alojamientos.add(h1);
        alojamientos.add(h2);
        alojamientos.add(h3);
        alojamientos.add(a1);
        alojamientos.add(a2);
        alojamientos.add(a3);

        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        alojamientosExtraHoteleros.add(a1);
        alojamientosExtraHoteleros.add(a2);
        alojamientosExtraHoteleros.add(a3);
    }

    public void menu() {

        boolean flag = true;

        while (flag) {

            System.out.println("*** MENÚ DE ALOJAMIENTOS *** \n"
                    + "1. Todos los alojamientos\n"
                    + "2. Hoteles según su precio\n"
                    + "3. Todos los campings con restaurante\n"
                    + "4. Residencias con descuentos\n"
                    + "5. Salir\n"
                    + "Elija una opción");

            int opcionMenu = leer.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("*ALOJAMIENTOS DISPONIBLES*");
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Hotel) {
                            System.out.println("HOTEL " + aux.getNombre() + "\n"
                                    + "Dirección " + aux.getDireccion() + ", " + aux.getLocalidad() + "\n"
                                    + "");
                        }
                        if (aux instanceof AlojamientoExtraHotelero) {
                            System.out.println("Alojamiento Extra Hotelero " + aux.getNombre() + "\n"
                                    + "Dirección " + aux.getDireccion() + ", " + aux.getLocalidad() + "\n"
                                    + "");
                        }
                    }
                    break;
                case 2:
                    System.out.println("HOTELES SEGÚN DE MAYOR PRECIO \n");
                    for (Hotel hotel : hoteles) {
                        hotel.precioHabitaciones();
                    }
                    hoteles.sort(Hotel.compararPrecio);
                    for (Hotel aux : hoteles) {
                        System.out.println("Hotel " + aux.getNombre() + "\n"
                                + "Dirección " + aux.getDireccion() + ", " + aux.getLocalidad() + "\n"
                                + "PRECIO $" + aux.getPrecioDeHabitaciones() + "\n"
                                + "");
                    }
                    break;
                case 3:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).isRestaurante() == true) {
                                System.out.println("Camping " + aux.getNombre() + "\n"
                                        + "Dirección " + aux.getDireccion() + ", " + aux.getLocalidad() + "\n"
                                        + "");
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Residencia) {
                            if (((Residencia) aux).isDescuentosGremios() == true) {
                                System.out.println("Residencia " + aux.getNombre() + "\n"
                                        + "Dirección " + aux.getDireccion() + ", " + aux.getLocalidad() + "\n"
                                        + "");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Gracias por visitar nuestra página!");
                    flag = false;
                    break;
                default:
                    System.out.println("Ingrese una opción correcta.");
            }

        }

    }

}
