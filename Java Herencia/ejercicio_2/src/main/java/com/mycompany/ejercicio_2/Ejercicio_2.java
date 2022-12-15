/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_2;

import Entidad.Lavadora;
import Entidad.Televisor;

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {

    public static void main(String[] args) {

        Lavadora l1 = new Lavadora();

        Televisor t1 = new Televisor();

        l1.crearLavadora();

        t1.crearTelevisor();

        System.out.println("Lavadora\n"
                + "PRECIO: " + l1.getPrecio() + "\n"
                + "COLOR: " + l1.getColor() + "\n"
                + "CONSUMO: " + l1.getConsumoEnergetico() + "\n"
                + "PESO: " + l1.getPeso() + "\n"
                + "CAPACIDAD: " + l1.getCarga());

        System.out.println("____________________");

        System.out.println("Televisor\n"
                + "PRECIO: " + t1.getPrecio() + "\n"
                + "COLOR: " + t1.getColor() + "\n"
                + "CONSUMO: " + t1.getConsumoEnergetico() + "\n"
                + "PESO: " + t1.getPeso() + "\n"
                + "PULGADAS: " + t1.getResolucion() + "\n"
                + "TDT: " + t1.isTDT());
    }

}
