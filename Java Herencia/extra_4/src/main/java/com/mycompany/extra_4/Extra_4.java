/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra_4;

import Servicio.ServicioFacultad;

/**
 *
 * @author Usuario
 */
public class Extra_4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ServicioFacultad sf = new ServicioFacultad();
        
        sf.cargarPersonas();
        sf.menu();
        
    }
}
