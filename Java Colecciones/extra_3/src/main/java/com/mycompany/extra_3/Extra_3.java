/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra_3;

import Entidad.Libro;
import Servicio.LibroServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        LibroServicio serLibro = new LibroServicio();
       
        serLibro.menu();

    }
}
