/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona p = new Persona();

        System.out.println("Ingrese su nombre y apellido: ");
        p.setNombre(leer.next());

        System.out.println("");
        System.out.println("Fecha de Nacimiento");
        System.out.println("Día: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);

        p.setFechaDeNacimiento(fecha);

        return p;
    }

    public void calcularEdad(Persona p) {

        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - (p.getFechaDeNacimiento().getYear() - 1900);

        System.out.println(p.getNombre() + " tiene " + edad + " años de edad.");
    }

    public void menorQue(Persona p, Persona p2) {

        int res = p.getFechaDeNacimiento().compareTo(p2.getFechaDeNacimiento());

        if (res < 0) {
            System.out.println(p.getNombre() + " es mayor.");
        } else if (res > 0) {
            System.out.println(p2.getNombre() + " es mayor.");
        } else {
            System.out.println("Ambos tienen la misma edad.");
        }
    }
    
    public void mostrarPersona(Persona p){
        
        System.out.println(p);
        
    }
}
