/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_4;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        r1.setBase(2);
        r1.setAltura(4);

        Circulo c1 = new Circulo();
        c1.setRadio(10);

        System.out.println("PERÍMETRO DEL RECTÁNGULO: " + (int) r1.calcularPerimetroRectangulo(r1.getBase(), r1.getAltura()));
        System.out.println("ÁREA DEL RECTÁNGULO: " + (int)  r1.calcularAreaRectangulo(r1.getBase(), r1.getAltura()));
        System.out.println("");
        System.out.println("PERÍMETRO DEL CÍRCULO: " + c1.calcularPerimetroCirculo(c1.getRadio()));
        System.out.println("ÁREA DEL CÍRCULO: " + c1.calcularAreaCirculo(c1.getRadio()));

    }
}
