/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RectanguloService recServicio = new RectanguloService();
        
        Rectangulo r1 = recServicio.crearRectangulo();
        
        int superficie = recServicio.calcularSuperficie(r1);
        
        int perimetro = recServicio.calcularPerimetro(r1);
        
        System.out.println("LA SUPERFICIE ES: " + superficie);
        System.out.println("EL PERIMETRO ES: " + perimetro);
        
        recServicio.dibujarRectangulo(r1);
        
        System.out.println(r1.toString());
        
    }
    
}
