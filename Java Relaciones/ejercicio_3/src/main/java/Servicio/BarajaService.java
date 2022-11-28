/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BarajaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> palos = new ArrayList<>();
    Baraja baraja = new Baraja();
    ArrayList<Carta> cartas = new ArrayList<>();
    ArrayList<Carta> monton = new ArrayList<>();

    public void llenarBaraja() {
        palos.add("Espada");
        palos.add("Basto");
        palos.add("Copa");
        palos.add("Oro");
        for (String palo : palos) {
            if (palo.equalsIgnoreCase("Espada")) {
                for (int i = 1; i <= 12; i++) {
                    if (i == 8 || i == 9) {
                        continue;
                    } else {
                        Carta c1 = new Carta();
                        c1.setNumero(i);
                        c1.setPalo(palo);
                        cartas.add(c1);
                    }
                }
            } else if (palo.equalsIgnoreCase("Basto")) {
                for (int i = 1; i <= 12; i++) {
                    if (i == 8 || i == 9) {
                        continue;
                    } else {
                        Carta c1 = new Carta();
                        c1.setNumero(i);
                        c1.setPalo(palo);
                        cartas.add(c1);
                    }
                }
            } else if (palo.equalsIgnoreCase("Copa")) {
                for (int i = 1; i <= 12; i++) {
                    if (i == 8 || i == 9) {
                        continue;
                    } else {
                        Carta c1 = new Carta();
                        c1.setNumero(i);
                        c1.setPalo(palo);
                        cartas.add(c1);

                    }
                }
            } else if (palo.equalsIgnoreCase("Oro")) {
                for (int i = 1; i <= 12; i++) {
                    if (i == 8 || i == 9) {
                        continue;
                    } else {
                        Carta c1 = new Carta();
                        c1.setNumero(i);
                        c1.setPalo(palo);
                        cartas.add(c1);
                    }
                }
            }
        }
        baraja.setBaraja(cartas);
    }

    public void mostrarNaipes() {
        System.out.println("");
        for (int i = 0; i < baraja.getBaraja().size(); i++) {
            System.out.println(baraja.getBaraja().get(i));
        }
        System.out.println("");
    }

    public void barajar() {
        Collections.shuffle(baraja.getBaraja());
    }

    public Carta siguienteCarta() {
        Carta carta = baraja.getBaraja().get(0);
        return carta;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas restantes = " + baraja.getBaraja().size());
        System.out.println("");
    }

    public void darCartas() {
        System.out.println("¿Cúantas cartas quiere?");
        int n = leer.nextInt();
        if (baraja.getBaraja().size() >= n) {
            for (int i = 0; i < n; i++) {
                monton.add(siguienteCarta());
                baraja.getBaraja().remove(0);
            }
        }
        System.out.println("");
    }

    public void cartasMonton() {
        if (monton.size() > 0) {
            System.out.println("Mazo de Cartas que Salieron");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
            System.out.println("");
        } else {
            System.out.println("No han salido cartas aún.");
            System.out.println("");
        }
    }

}
