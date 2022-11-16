/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
        numero de páginas.*/
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro libro1 = new Libro();
        
        System.out.println("Ingrese el código ISBN");
        String ISBN = leer.next();
        
        System.out.println("Ingrese el Título del libro");
        String Titulo = leer.next();
        
        System.out.println("Ingrese el autor del libro");
        String Autor = leer.next();
        
        System.out.println("Ingrese el número de páginas");
        int numeroPaginas = leer.nextInt();
        
        libro1.llenarLibro(ISBN, Titulo, Autor, numeroPaginas);
        
        libro1.mostarLibro();        
    }    
}
