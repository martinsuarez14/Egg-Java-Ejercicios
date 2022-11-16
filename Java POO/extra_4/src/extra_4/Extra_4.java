/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extra_4;

import Entidad.NIF;
import Service.NIFService;

/**
 *
 * @author Usuario
 */
public class Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NIFService ns = new NIFService();
        
        NIF n1 = ns.crearNif();
        
        ns.mostrar(n1);
        
    }

}
