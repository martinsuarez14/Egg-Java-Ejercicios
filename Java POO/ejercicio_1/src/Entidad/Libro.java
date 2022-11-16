/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
        /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
        numero de páginas.*/
public class Libro {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void llenarLibro(String ISBN, String Titulo, String Autor, int numeroPaginas){
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;      
        }
    
    public void mostarLibro(){
        System.out.println("El codigo es: " + ISBN);
        System.out.println("El título es: " + Titulo);
        System.out.println("El autor es:" + Autor);
        System.out.println("El número de páginas es: " + numeroPaginas);
    }
    
    
    
    
    
    
    
    
    
}
