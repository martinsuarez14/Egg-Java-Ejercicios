/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_3;

import Servicio.BarajaService;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        
        BarajaService bs = new BarajaService();
        
        bs.llenarBaraja();
        
        bs.mostrarNaipes();
        
        bs.barajar();
        
        bs.mostrarNaipes();
        
        System.out.println("La siguiente carta es: " + bs.siguienteCarta());
        
        bs.cartasDisponibles();
        
        bs.darCartas();
        
        bs.cartasDisponibles();
        
        
        bs.mostrarNaipes();
        
        bs.cartasMonton();
        
    }
}
