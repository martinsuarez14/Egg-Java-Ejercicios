/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        PersonaService perService = new PersonaService();

        int sobrePeso = 0;
        int pesoIdeal = 0;
        int bajoPeso = 0;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        Persona p1 = perService.crearPersona();
        int pesoP1 = perService.calcularMC(p1);
        boolean edadP1 = perService.esMayorDeEdad(p1);

        switch (pesoP1) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoIdeal += 1;
                break;
            case 1:
                sobrePeso += 1;
                break;
        }

        if (edadP1 == true) {
            mayoresDeEdad += 1;
        } else {
            menoresDeEdad += 1;
        }

        Persona p2 = perService.crearPersona();
        int pesoP2 = perService.calcularMC(p2);
        boolean edadP2 = perService.esMayorDeEdad(p2);

        switch (pesoP2) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoIdeal += 1;
                break;
            case 1:
                sobrePeso += 1;
                break;
        }

        if (edadP2 == true) {
            mayoresDeEdad += 1;
        } else {
            menoresDeEdad += 1;
        }

        Persona p3 = perService.crearPersona();
        int pesoP3 = perService.calcularMC(p3);
        boolean edadP3 = perService.esMayorDeEdad(p3);

        switch (pesoP3) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoIdeal += 1;
                break;
            case 1:
                sobrePeso += 1;
                break;
        }

        if (edadP3 == true) {
            mayoresDeEdad += 1;
        } else {
            menoresDeEdad += 1;
        }

        Persona p4 = perService.crearPersona();
        int pesoP4 = perService.calcularMC(p4);
        boolean edadP4 = perService.esMayorDeEdad(p4);

        switch (pesoP4) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoIdeal += 1;
                break;
            case 1:
                sobrePeso += 1;
                break;
        }

        if (edadP4 == true) {
            mayoresDeEdad += 1;
        } else {
            menoresDeEdad += 1;
        }

        double porcentajeBajoPeso = (bajoPeso * 100) / 4;
        double porcentajePesoIdeal = (pesoIdeal * 100) / 4;
        double porcentajeSobrePeso = (sobrePeso * 100) / 4;

        double porcentajeMayores = (mayoresDeEdad * 100) / 4;
        double porcentajeMenores = (menoresDeEdad * 100) / 4;

        System.out.println("RESULTADOS: \n"
                + "Porcentaje con bajo peso: " + porcentajeBajoPeso + "% \n"
                + "Porcentaje con sobre peso: " + porcentajeSobrePeso + "% \n"
                + "Porcentaje con peso ideal: " + porcentajePesoIdeal + "% \n"
                + "----------\n"
                + "Porcentaje mayores de edad: " + porcentajeMayores + "% \n"
                + "Porcentaje menores de edad: " + porcentajeMenores + "% \n"
                + "--------------");

    }

}
