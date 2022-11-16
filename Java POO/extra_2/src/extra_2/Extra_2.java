/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_2;

import Entidad.Puntos;
import Service.PuntosService;

/**
 *
 * @author Usuario
 */
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntosService ps = new PuntosService();
        
        Puntos p1 = ps.generarPuntos();

        ps.calcular();

    }
    
}
