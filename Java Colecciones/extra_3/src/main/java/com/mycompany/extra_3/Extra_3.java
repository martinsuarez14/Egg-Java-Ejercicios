/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra_3;

import Entidad.Libro;
import Servicio.LibroServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_3 {

    public static void main(String[] args) {

        LibroServicio serLibro = new LibroServicio();

        HashSet<Libro> biblioteca = new HashSet<>();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String opcion;

        do {

            Libro l1 = new Libro();

            System.out.println("Ingrese el título del libro: ");
            l1.setTituloDelLibro(leer.next());
            System.out.println("Ingrese el autor del libro: ");
            l1.setAutor(leer.next());
            System.out.println("Ingrese el número de ejemplares: ");
            l1.setTituloDelLibro(leer.next());

            l1.setEjemplaresPrestados(0);

            biblioteca.add(l1);

            System.out.println("Añadir más libros? S/N");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("s"));

               biblioteca.forEach((libro) -> {System.out.println(libro.getTituloDelLibro() + "   " + libro.getAutor());});


        int op;

        boolean flag = true;

        do {

            System.out.println("------------------\n"
                    + "----MENÚ----\n"
                    + "1. Retirar un libro\n"
                    + "2. Devolver un libro\n"
                    + "3. Mostrar Libros\n"
                    + "4. Salir\n"
                    + "Ingrese una opción: \n");
            op = leer.nextInt();

            System.out.println("--------------");
            switch (op) {
                case 1:
                    if (serLibro.prestamo(biblioteca) == true) {
                        System.out.println("Tomá tu libro y andate!");
                    } else {
                        System.out.println("El libro está agotado");
                    }
                    break;
                case 2:
                    if (serLibro.devolucion(biblioteca) == true) {
                        System.out.println("Gracias por devolver el libro!");
                    } else {
                        System.out.println("Nada que ver lo que querés devovler!! Por eso te gorrean!");
                    }
                    break;
                case 3:
                    serLibro.mostrarLibros(biblioteca);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta!");
            }
        } while (flag == true);

    }
}
