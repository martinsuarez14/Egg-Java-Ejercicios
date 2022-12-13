/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CineService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Cine> pantallas = new ArrayList<>();

    public ArrayList llenarCine(ArrayList pantallas) {

        Cine c1 = new Cine();
        Pelicula p1 = new Pelicula("Titanic", 170, 13, "James");
        c1.setPelicula(p1);
        c1.setPrecioEntrada(700);
        c1.setSala(llenarSala());

        Cine c2 = new Cine();
        Pelicula p2 = new Pelicula("Avengers: End Game", 140, 7, "Hermanos Russo");
        c2.setPelicula(p2);
        c2.setPrecioEntrada(700);
        c2.setSala(llenarSala());

        Cine c3 = new Cine();
        Pelicula p3 = new Pelicula("El Ataque del Dedo sin Uña", 110, 18, "Jordi ENP");
        c3.setPelicula(p3);
        c3.setPrecioEntrada(700);
        c3.setSala(llenarSala());

        pantallas.add(c1);
        pantallas.add(c2);
        pantallas.add(c3);

        return pantallas;
    }

    public String[][] llenarSala() {

        String[][] matriz = new String[8][6];

        String[] colum = new String[6];
        colum[0] = "A";
        colum[1] = "B";
        colum[2] = "C";
        colum[3] = "D";
        colum[4] = "E";
        colum[5] = "F";

        String[] fila = new String[8];
        fila[0] = "8";
        fila[1] = "7";
        fila[2] = "6";
        fila[3] = "5";
        fila[4] = "4";
        fila[5] = "3";
        fila[6] = "2";
        fila[7] = "1";

        for (int i = 0; i < fila.length; i++) {
            for (int j = 0; j < colum.length; j++) {
                matriz[i][j] = fila[i] + colum[j];
            }
        }

        return matriz;
    }

    public void venderEntrada() {

        llenarCine(pantallas);

        llenadoAleatorio(pantallas.get(0).getSala());
        llenadoAleatorio(pantallas.get(1).getSala());
        llenadoAleatorio(pantallas.get(2).getSala());
        boolean flag = false;

        String[] colum = new String[6];
        colum[0] = "A";
        colum[1] = "B";
        colum[2] = "C";
        colum[3] = "D";
        colum[4] = "E";
        colum[5] = "F";

        String[] fila = new String[8];
        fila[0] = "8";
        fila[1] = "7";
        fila[2] = "6";
        fila[3] = "5";
        fila[4] = "4";
        fila[5] = "3";
        fila[6] = "2";
        fila[7] = "1";

        do {
            Espectador espectador = new Espectador();
            System.out.println("Ingrese su nombre: ");
            espectador.setNombre(leer.next());
            System.out.println("Ingrese su edad: ");
            espectador.setEdad(leer.nextInt());
            System.out.println("Ingrese su dinero disponible: ");
            espectador.setDineroDisponible(leer.nextInt());

            System.out.println("");

            if (espectador.getDineroDisponible() < pantallas.get(0).getPrecioEntrada()) {
                System.out.println(espectador.getNombre() + " no tienes dinero suficiente. " + "Te faltan $" + (pantallas.get(0).getPrecioEntrada() - espectador.getDineroDisponible()));
            } else {
                System.out.println("¿Qué película deseas ver? \n"
                        + "1. " + pantallas.get(0).getPelicula().getTitulo() + "\n"
                        + "2. " + pantallas.get(1).getPelicula().getTitulo() + "\n"
                        + "3. " + pantallas.get(2).getPelicula().getTitulo() + "\n"
                        + "Valor de la entrada $700,00");
                int opcion = leer.nextInt();
                System.out.println("");

                switch (opcion) {
                    case 1:
                        if (espectador.getEdad() >= pantallas.get(0).getPelicula().getEdadMinima()) {
                            boolean salir = false;
                            for (int i = 0; i < 8; i++) {
                                for (int j = 0; j < 6; j++) {
                                    if (!pantallas.get(0).getSala()[i][j].endsWith("X")) {
                                        System.out.println("Su asiento es " + pantallas.get(0).getSala()[i][j]);
                                        pantallas.get(0).getSala()[i][j] = pantallas.get(0).getSala()[i][j] + "X";
                                        mostrarSala(pantallas.get(0));
                                        salir = true;
                                        break;
                                    }
                                }
                                if (salir == true) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("No tienes la edad suficiente!");
                            System.out.println("");
                        }

                        break;
                    case 2:
                        if (espectador.getEdad() >= pantallas.get(1).getPelicula().getEdadMinima()) {
                            boolean salir = false;
                            for (int i = 0; i < 8; i++) {
                                for (int j = 0; j < 6; j++) {
                                    if (!pantallas.get(1).getSala()[i][j].endsWith("X")) {
                                        System.out.println("Su asiento es " + pantallas.get(1).getSala()[i][j]);
                                        pantallas.get(1).getSala()[i][j] = pantallas.get(1).getSala()[i][j] + "X";
                                        mostrarSala(pantallas.get(1));
                                        salir = true;
                                        break;
                                    }
                                }
                                if (salir == true) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("No tienes la edad suficiente!");
                        }

                        break;
                    case 3:
                        if (espectador.getEdad() >= pantallas.get(2).getPelicula().getEdadMinima()) {
                            boolean salir = false;
                            for (int i = 0; i < 8; i++) {
                                for (int j = 0; j < 6; j++) {
                                    if (!pantallas.get(2).getSala()[i][j].endsWith("X")) {
                                        System.out.println("Su asiento es " + pantallas.get(2).getSala()[i][j]);
                                        pantallas.get(2).getSala()[i][j] = pantallas.get(2).getSala()[i][j] + "X";
                                        mostrarSala(pantallas.get(2));
                                        salir = true;
                                        break;
                                    }
                                }
                                if (salir == true) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("No tienes la edad suficiente!");
                        }

                        break;
                    default:
                        System.out.println("La opción ingresada no es correcta. Por eso te gorrean!");
                }
            }

            System.out.println("¿Ingresará otro espectador? S/N");
            String op = leer.next();

            if (op.equalsIgnoreCase("N")) {
                flag = true;
            }

        } while (flag == false);
    }

    public void mostrarSala(Cine c1) {

        System.out.println("");
        System.out.println("SALA DE " + c1.getPelicula().getTitulo().toLowerCase());
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(c1.getSala()[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("*****************");
    }

    public int aleatorio(int n) {
        int num = (int) (Math.random() * n);
        return num;
    }

    public void llenadoAleatorio(String[][] matrix) {

        int contador = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                int fila = aleatorio(7);
                int columna = aleatorio(5);
                matrix[fila][columna] = matrix[i][j] + "X";
                contador++;
                if (contador == 15) {
                    j = 6;
                    i = 8;
                }
            }
        }
    }
    
    
}
