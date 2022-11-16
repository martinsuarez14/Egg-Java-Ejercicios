/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import Entidad.Matematica;
import Servicio.MatematicaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Matematica m1 = new Matematica();

        MatematicaServicio matServicio = new MatematicaServicio();

        m1.setNum1((double) (Math.random() * 100));
        m1.setNum2((double) (Math.random() * 100));

        System.out.println(m1.getNum1());
        System.out.println(m1.getNum2());
        
        matServicio.devolverMayor(m1);
        matServicio.calcularPotencia(m1);
        matServicio.calcularRaiz(m1);
    }

}
