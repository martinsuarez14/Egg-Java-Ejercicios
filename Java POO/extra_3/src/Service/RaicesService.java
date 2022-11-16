/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaicesService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Raices r1 = new Raices();

    public Raices crearCuenta() {

        Raices r2 = new Raices();

        System.out.println("Ingrese el valor de A: ");
        r1.setA(leer.nextDouble());

        System.out.println("Ingrese el valor de B: ");
        r1.setB(leer.nextDouble());

        System.out.println("Ingrese el valor de C: ");
        r1.setC(leer.nextDouble());

        return r1;
    }

    public double getDiscriminante() {

        //double discriminante = 0;
        double discriminante = (double) (Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()));

        return discriminante;
    }

    public boolean tieneRaices() {

        boolean raices = false;

        if (getDiscriminante() > 0) {
            raices = true;
        }

        return raices;
    }

    public boolean tieneRaiz() {

        boolean raiz = false;

        if (getDiscriminante() == 0) {
            raiz = true;
        }

        return raiz;
    }

    public void obtenerRaices() {

        //     (-b±√((b^2)-(4*a*c)))/(2*a)
        if (tieneRaices() == true) {
            System.out.println("PRIMER RESULTADO: " + r1.getB() + "+√((" + r1.getB() + "^2)-(4*" + r1.getA() + "*" + r1.getC() + ")))/(2*" + r1.getA() + ")");
            System.out.println("SEGUNDO RESULTADO: " + r1.getB() + "-√((" + r1.getB() + "^2)-(4*" + r1.getA() + "*" + r1.getC() + ")))/(2*" + r1.getA() + ")");
            //res = (int) ((-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA()));
            //res1 = (int) ((-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA()));
            //System.out.println("Primer Resultado: " + res);
            //System.out.println("Segundo Resultado: " + res1);
        } else {
            System.out.println("No tiene raices.");
        }
    }

    public void obtenerRaiz() {

        if (tieneRaiz() == true) {
            System.out.println("Resultado: " + "-" + r1.getB());
            //System.out.println("PRIMER RESULTADO: -" + r1.getB() + "+√((" + r1.getB() + "^2)-(4*" + r1.getA() + "*" + r1.getC() + ")))/(2*" + r1.getA() + ")");
            //res = (int) ((-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA()));
            //res1 = (int) ((-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA()));
        }
    }

    public void calcular() {

        if (tieneRaices()) {
            obtenerRaices();
            int resultado = (int) ((-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA()));
            int resultado2 = (int) ((-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA()));
            System.out.println("--------");
            System.out.println("Primer resultado: " + resultado);
            System.out.println("");
            System.out.println("Segundo resultado: " + resultado2);
        } else if (tieneRaiz()) {
            obtenerRaiz();
            int resultado3 = (int) ((-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC()))) / (2 * r1.getA()));
            System.out.println("--------");
            System.out.println("Resultado: " + resultado3);
        } else {
            System.out.println("No tiene solución.");
        }

    }

}
