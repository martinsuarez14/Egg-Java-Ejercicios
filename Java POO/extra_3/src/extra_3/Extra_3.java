/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_3;

import Entidad.Raices;
import Service.RaicesService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        RaicesService rs = new RaicesService();
        
        Raices r1 = rs.crearCuenta();
        
        rs.calcular();
        
    }

}
