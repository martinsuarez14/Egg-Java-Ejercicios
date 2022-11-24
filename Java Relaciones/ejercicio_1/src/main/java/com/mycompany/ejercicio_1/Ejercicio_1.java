package com.mycompany.ejercicio_1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Nilo", "Europeo de pelo corto", 1, "Chico");
        Perro perro2 = new Perro("Simón", "Callejero Alemán", 5, "Mediano");

        Persona p1 = new Persona("Martin", "Suarez", 26, 38817351, perro1);
        Persona p2 = new Persona("Diana", "Comán", 27, 38817352, perro2);

        p1.mostrarPersona();
    }
}
