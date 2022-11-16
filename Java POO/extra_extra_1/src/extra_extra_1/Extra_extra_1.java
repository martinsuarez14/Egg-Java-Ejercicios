/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_extra_1;

import Entidad.Fraccion;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Extra_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Fraccion f1 = new Fraccion(1, 4);
        Fraccion f2 = new Fraccion(1, 2);

        Fraccion suma = f1.sumar(f2);

        System.out.println(f1 + " + " + f2 + " = " + suma);
*/
        HashMap<Integer, String> personas = new HashMap();

        String n1 = "Albus";

        String n2 = "Severus";

        personas.put(0, n1);
        personas.put(2, n2);

        for (Map.Entry<Integer, String> alumno : personas.entrySet()) {
            System.out.println("lugar=" + alumno.getKey()
                    + ", nombre=" + alumno.getValue());
        }
    }
}
