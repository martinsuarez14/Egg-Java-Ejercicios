/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RectanguloService {
    
    public Rectangulo crearRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("INGRESE EL VALOR DE LA BASE");
        r1.setBase(leer.nextInt());
        
        System.out.println("INGRESE EL VALOR DE LA ALTURA");
        r1.setAltura(leer.nextInt());
        
        return r1;
    }
    
    public int calcularSuperficie(Rectangulo r1){
        
        int superficie = r1.getBase() * r1.getAltura();
        
        return superficie;
    }    
    
    public int calcularPerimetro(Rectangulo r1){
        
        int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        
        return perimetro;        
    }
    
    public void dibujarRectangulo(Rectangulo r1){
        
        for (int i = 1; i <= r1.getAltura(); i++) {
            for (int j = 1; j <= r1.getBase(); j++) {
                if ((i == 1 || i == r1.getAltura()) || (j == 1 || j == r1.getBase())){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }                                
            }
            System.out.println("");
        }
        
    }
    
}
