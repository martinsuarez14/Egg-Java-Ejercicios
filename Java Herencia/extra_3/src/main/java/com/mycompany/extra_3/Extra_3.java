/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra_3;

import Servicio.ServicioAlojamiento;

/**
 *
 * @author Usuario
 */
public class Extra_3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ServicioAlojamiento sA = new ServicioAlojamiento();
        
        sA.crearResidencias();
        sA.menu();
        
        
    }
}
