/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PuntosService {

    Scanner leer = new Scanner(System.in);

    Puntos p1 = new Puntos();
    
    public Puntos generarPuntos(){
        
        Puntos p2 = new Puntos();
        
        System.out.println("Ingrese el punto x1: ");
        p1.setX1(leer.nextInt());
        
        System.out.println("Ingrese el punto y1: ");
        p1.setY1(leer.nextInt());
        
        System.out.println("Ingrese el punto x2: ");
        p1.setX2(leer.nextInt());
        
        System.out.println("Ingrese el punto y2: ");
        p1.setY2(leer.nextInt());
        
        return p1;
    }
    
    public void calcular(){
        
        double distancia = 0;
        
        distancia = Math.sqrt(Math.pow(p1.getX2() - p1.getX1(), 2) + (Math.pow(p1.getY2() - p1.getY1(), 2)));

        System.out.println("La distancia entre los puntos es: " + distancia);
    }
    
    
}
