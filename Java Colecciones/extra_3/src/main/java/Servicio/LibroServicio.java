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

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean prestamo(HashSet<Libro> biblioteca) {
        
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
    
    public boolean devolucion(HashSet<Libro> biblioteca) {
        
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
    
    public void mostrarLibros(HashSet<Libro> biblioteca) {
        
        biblioteca.forEach((libro) -> {System.out.println(libro.getTituloDelLibro() + "   " + libro.getAutor());});
        
    }
}
