/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra_2;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Extra_2 {

    public static void main(String[] args) {

        List<Edificio> edificios = new ArrayList<>();

        Edificio poli1 = new Polideportivo("Estrellas", "Techado", 25d, 4d, 30d);
        edificios.add(poli1);
        Edificio poli2 = new Polideportivo("Club Social", "Abierto", 23d, 1d, 35d);
        edificios.add(poli2);
        Edificio poli3 = new Polideportivo("Racing", "Abierto", 37d, 8d, 40d);
        edificios.add(poli3);

        Edificio ofi1 = new EdificioDeOficinas(15, 12, 15, 35d, 45d, 35d);
        edificios.add(ofi1);
        Edificio ofi2 = new EdificioDeOficinas(8, 20, 8, 30d, 24d, 35d);
        edificios.add(ofi2);
        Edificio ofi3 = new EdificioDeOficinas(4, 15, 4, 25d, 12d, 35d);
        edificios.add(ofi3);

        int contEdificios = 1;
        int contEdificiosOficina = 1;
        int techados = 0;
        int abiertos = 0;

        for (Edificio aux : edificios) {
            System.out.println("Edificio " + contEdificios + "\n"
                    + "Superficie " + aux.calcularSuperficie() + " m2 \n"
                    + "Volumen " + aux.calcularVolumen() + " m3 \n"
                    + "");
            contEdificios++;

            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).getTipoDeInstalacion().equalsIgnoreCase("Abierto")) {
                    abiertos++;
                } else {
                    techados++;
                }
            }
        }

        System.out.println("POLIDEPORTIVOS \n"
                + "Abiertos: " + abiertos + "\n"
                + "Techados: " + techados + "\n"
                + "");

        System.out.println("EDIFICIOS DE OFICINAS");
        for (Edificio aux : edificios) {
            if (aux instanceof EdificioDeOficinas) {
                System.out.println("Edificio " + contEdificiosOficina);
                ((EdificioDeOficinas) aux).cantPersonas();
                System.out.println("");
                contEdificiosOficina++;
            }
        }
    }
}
