/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_2;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> musimundo = new ArrayList<>();

        Lavadora l1 = new Lavadora(35, 1000, "azul", 'A', 20);
        Lavadora l2 = new Lavadora(20, 1000, "negro", 'A', 50);
        Lavadora l3 = new Lavadora(18, 1000, "blanco", 'A', 20);

        Televisor t1 = new Televisor(40, true, 1000, "negro", 'B', 25);
        Televisor t2 = new Televisor(35, false, 1000, "blanco", 'F', 15);
        Televisor t3 = new Televisor(24, true, 1000, "gris", 'J', 30);

//        l1.crearLavadora();
// 
//       
//        t1.crearTelevisor();
//        
//        System.out.println("Lavadora\n"
//                + "PRECIO: " + l1.getPrecio() + "\n"
//                + "COLOR: " + l1.getColor() + "\n"
//                + "CONSUMO: " + l1.getConsumoEnergetico() + "\n"
//                + "PESO: " + l1.getPeso() + "\n"
//                + "CAPACIDAD: " + l1.getCarga());
//
//        System.out.println("____________________");
//
//        System.out.println("Televisor\n"
//                + "PRECIO: " + t1.getPrecio() + "\n"
//                + "COLOR: " + t1.getColor() + "\n"
//                + "CONSUMO: " + t1.getConsumoEnergetico() + "\n"
//                + "PESO: " + t1.getPeso() + "\n"
//                + "PULGADAS: " + t1.getResolucion() + "\n"
//                + "TDT: " + t1.isTDT());
//        
//        l2.crearLavadora();
//        l3.crearLavadora();
//        
//        t2.crearTelevisor();
//        t3.crearTelevisor();
//        
        musimundo.add(l1);
        musimundo.add(l2);
        musimundo.add(l3);
        musimundo.add(t1);
        musimundo.add(t2);
        musimundo.add(t3);

        int precioTotalLavadoras = 0;
        int precioTotalTelevisores = 0;
        int precioTotalDeElectrodomesticos = 0;

        for (Electrodomestico aux : musimundo) {

            aux.precioFinal();

            if (aux instanceof Lavadora) {
                precioTotalLavadoras += aux.getPrecio();
                precioTotalDeElectrodomesticos += aux.getPrecio();
            }
            if (aux instanceof Televisor) {
                precioTotalTelevisores += aux.getPrecio();
                precioTotalDeElectrodomesticos += aux.getPrecio();
            }

        }
        System.out.println("");

        System.out.println("Precio Total de televisores: $" + precioTotalTelevisores + "\n"
                + "Precio Total de lavadoras: $" + precioTotalLavadoras + "\n"
                + "Precio TOTAL de electrodomésticos: $" + precioTotalDeElectrodomesticos);

    }

}
