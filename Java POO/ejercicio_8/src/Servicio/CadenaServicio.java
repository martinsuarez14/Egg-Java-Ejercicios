/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena c1) {

        int vocales = 0;

        String[] vector = new String[c1.getLongitud()];

        for (int i = 0; i < c1.getLongitud(); i++) {
            vector[i] = c1.getFrase().substring(i, i + 1);

            switch (vector[i]) {
                case "A":
                    vocales += 1;
                    break;
                case "a":
                    vocales += 1;
                    break;
                case "E":
                    vocales += 1;
                    break;
                case "e":
                    vocales += 1;
                    break;
                case "I":
                    vocales += 1;
                    break;
                case "i":
                    vocales += 1;
                    break;
                case "O":
                    vocales += 1;
                    break;
                case "o":
                    vocales += 1;
                    break;
                case "U":
                    vocales += 1;
                    break;
                case "u":
                    vocales += 1;
                    break;
            }
        }
        System.out.println("La frase tiene: " + vocales + " vocales.");
    }

    public void invertirFrase(Cadena c1) {

        StringBuilder invertir = new StringBuilder(c1.getFrase());

        String cadenaInvertida = invertir.reverse().toString();

        System.out.println(cadenaInvertida);

    }

    public void vecesRepetido(Cadena c1) {

        System.out.println("Ingrese el caracter que desea buscar: ");
        String letra = leer.nextLine();
        String letraMayus = letra.toUpperCase();

        int cantidad = 0;

        String[] vector = new String[c1.getLongitud()];

        for (int i = 0; i < c1.getLongitud(); i++) {
            vector[i] = c1.getFrase().substring(i, i + 1);

            if (vector[i].equals(letra) || vector[i].equals(letraMayus)) {
                cantidad += 1;
            }
        }
        if (cantidad > 0) {
            System.out.println("El caracter " + letra + " se repite " + cantidad + " veces.");

        } else {
            System.out.println("La letra " + letra + " no se encuentra en la frase.");
        }
    }

    public boolean compararLongitud(Cadena c1, String cadena) {

        boolean resultado = false;

        if (c1.getLongitud() == cadena.length()) {
            resultado = true;
        }

        return resultado;
    }

    public String unirFrases(Cadena c1, String cadena) {

        String fraseUnida;

        fraseUnida = c1.getFrase().concat(cadena);

        return fraseUnida;
    }

    public void reemplazar(Cadena c1) {

        System.out.println("Ingrese un caracter para reemplazar las a");
        String caracter = leer.next();

        String[] vector = new String[c1.getLongitud()];

        for (int i = 0; i < c1.getLongitud(); i++) {

            vector[i] = c1.getFrase().substring(i, i + 1);

            if (vector[i].equals("a")) {
                vector[i] = caracter;
            }
        }

        for (int i = 0; i < c1.getLongitud(); i++) {
            System.out.print(vector[i]);
        }
        System.out.println("");
    }

    public boolean contiene(Cadena c1, String letra) {

        boolean contiene = false;

        String[] vector = new String[c1.getLongitud()];

        for (int i = 0; i < c1.getLongitud(); i++) {

            vector[i] = c1.getFrase().substring(i, i + 1);

            if (vector[i].equals(letra)) {
                contiene = true;
            }
        }
        return contiene;
    }
}
