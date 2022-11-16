/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import static java.lang.Math.abs;
import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MatematicaServicio {

    Scanner leer = new Scanner(System.in);

    public void devolverMayor(Matematica m1) {

        double resultado = Double.max(m1.getNum1(), m1.getNum2());

        System.out.println("El número mayor es: " + resultado);
    }

    public void calcularPotencia(Matematica m1) {

        int num1 = (int) round(m1.getNum1());
        int num2 = (int) round(m1.getNum2());

        if (num1 >= num2) {
            int resultado = (int) (Math.pow(num1, num2));
            System.out.println(num1 + " elevado a la " + num2 + " es: " + resultado);
        } else if (num1 < num2) {
            int resultado = (int) (Math.pow(num2, num1));
            System.out.println(num2 + " elevado a la " + num1 + " es: " + resultado);
        }
    }

    public void calcularRaiz(Matematica m1) {

        double resultado = Double.min(m1.getNum1(), m1.getNum2());
        System.out.println(resultado);
        resultado = abs(resultado);
        System.out.println(resultado);

        int raiz = (int) Math.sqrt(resultado);
        System.out.println(raiz);

        System.out.println("La raiz cuadrada es: " + raiz);
    }
}
