/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibroServicio {

    HashSet<Libro> biblioteca = new HashSet<>();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro() {

        String opcion;
        do {

            Libro l1 = new Libro();

            System.out.println("Ingrese el título del libro: ");
            l1.setTituloDelLibro(leer.next());
            System.out.println("Ingrese el autor del libro: ");
            l1.setAutor(leer.next());
            System.out.println("Ingrese el número de ejemplares: ");
            l1.setEjemplares(leer.nextInt());

            l1.setEjemplaresPrestados(0);

            biblioteca.add(l1);

            System.out.println("Añadir más libros? S/N");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("s"));
    }

    public void ingresarLibros(Libro l1) {

        biblioteca.add(l1);
    }

    public boolean prestamo() {

        //ArrayList<Libro> aux = new ArrayList<>(biblioteca);
        boolean res = false;

        System.out.println("Ingrese el titulo del libro que quiere: ");
        String nombre = leer.next();

        Libro[] aux = (Libro[]) biblioteca.toArray();

        for (int i = 0; i < aux.length; i++) {

            if (aux[i].getTituloDelLibro().equalsIgnoreCase(nombre)) {

                if (aux[i].getEjemplares() > 0) {
                    aux[i].setEjemplaresPrestados(aux[i].getEjemplaresPrestados() + 1);
                    aux[i].setEjemplares(aux[i].getEjemplares() - 1);
                    res = true;
                }
            }
        }

        biblioteca.clear();

        for (int i = 0; i < aux.length; i++) {
            biblioteca.add(aux[i]);
        }

        return res;
    }

    public boolean devolucion() {

        boolean res = false;

        System.out.println("Ingrese el titulo del libro que quiere devolver: ");
        String nombre = leer.next();

        Libro[] aux = (Libro[]) biblioteca.toArray();

        for (int i = 0; i < aux.length; i++) {

            if (aux[i].getTituloDelLibro().equalsIgnoreCase(nombre)) {

                if (aux[i].getEjemplaresPrestados() > 0) {
                    aux[i].setEjemplaresPrestados(aux[i].getEjemplaresPrestados() - 1);
                    aux[i].setEjemplares(aux[i].getEjemplares() + 1);
                    res = true;
                }
            }
        }

        biblioteca.clear();

        for (int i = 0; i < aux.length; i++) {
            biblioteca.add(aux[i]);
        }

        return res;
    }

    public void mostrarLibros() {
        System.out.println("......INFORMACIÓN......");
        Iterator<Libro> it = biblioteca.iterator();//recorrer con iterator o escribir con foreach
        while (it.hasNext()) {
            Libro book = it.next();
            System.out.println("NOMBRE: " + book.getTituloDelLibro().toUpperCase() + "\n"
                    + "AUTOR: " + book.getAutor().toUpperCase() + "\n"
                    + "EJEMPLARES DISPONIBLES: " + book.getEjemplares()+ "\n"
                    + "PRESTADOS: " + book.getEjemplaresPrestados());
            System.out.println(".......................");
        }

    }

    public void menu() {

        int op;

        boolean flag = true;

        do {

            System.out.println("------------------\n"
                    + "----MENÚ----\n"
                    + "1. Retirar un libro\n"
                    + "2. Devolver un libro\n"
                    + "3. Mostrar Libros\n"
                    + "4. Salir\n"
                    + "5. Ingresar Libros\n"
                    + "Ingrese una opción: \n");
            op = leer.nextInt();

            System.out.println("--------------");
            switch (op) {
                case 1:
                    boolean resultado = prestamo();
                    if (prestamo() == true) {
                        System.out.println("Tomá tu libro y andate!");
                    } else {
                        System.out.println("El libro está agotado");
                    }
                    break;
                case 2:
                    boolean resul = devolucion();
                    if (resul == true) {
                        System.out.println("Gracias por devolver el libro!");
                    } else {
                        System.out.println("Nada que ver lo que querés devovler!! Por eso te gorrean!");
                    }
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    flag = false;
                    break;
                case 5:
                    crearLibro();
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta!");
            }
        } while (flag == true);

    }
}
