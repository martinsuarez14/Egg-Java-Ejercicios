/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafeteraService {
    
    Scanner leer = new Scanner(System.in);
    
    Cafetera ATMA = new Cafetera();
    
    public Cafetera capacidadMax(){
        System.out.print("INGRESE LA CAPACIDAD MÁXIMA DE LA CAFETERA: ");
        ATMA.setCapacidadMaxima(leer.nextDouble());
        System.out.println("Su cafetera tiene " + ATMA.getCapacidadMaxima() + " de capacidad.");
        return ATMA;
    }    
    
    public void llenarCafetera(){
        
        ATMA.setCapacidadActual(ATMA.getCapacidadMaxima());
        
    }
    
    public void servirTaza(){
        
        System.out.println("Ingrese la capacidad de la taza");
        
        int taza = leer.nextInt();
        
        if (ATMA.getCapacidadActual() >= taza){
            
            ATMA.setCapacidadActual(ATMA.getCapacidadActual() - taza);
            System.out.println("Su café está listo!");
        } else {
            System.out.println("La cantidad actual de café, no alcanza para llenar la taza.");
            System.out.println("Su taza se cargó con " + ATMA.getCapacidadActual() + " ml");
            ATMA.setCapacidadActual(0);
        }                      
    }
    
    public void vaciarCafetera( ){
        
        ATMA.setCapacidadActual(0);        
    }
    
    public void agregarCafe( ){
        
        System.out.println("¿Cuánto café desea cargar en la cafetera?");
        int cafe = leer.nextInt();
    }
    
}
