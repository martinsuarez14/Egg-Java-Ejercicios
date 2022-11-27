/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RuletaRusaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    RevolverDeAgua r1 = new RevolverDeAgua();
    Jugador j1 = new Jugador();
    Juego juego = new Juego();
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public RevolverDeAgua llenarRevolcer() {
        r1.setPosicionActual((int) ((Math.random() * 6) + 1));
        r1.setPosicionAgua((int) ((Math.random() * 6) + 1));
        return r1;
    }

    public boolean mojar() {
        boolean res = false;
        if (r1.getPosicionActual() == r1.getPosicionAgua()) {
            res = true;
        }
        return res;
    }

    public void siguienteChorro() {

        if (r1.getPosicionActual() == 6) {
            r1.setPosicionActual(1);
        } else {
            r1.setPosicionActual(r1.getPosicionActual() + 1);
        }
    }

    public boolean disparo(RevolverDeAgua r1) {

        boolean res = false;

        boolean disparo = mojar();
        if (disparo == true) {
            j1.setMojado(true);
            res = true;
        } else {
            siguienteChorro();
        }
        return res;
    }

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r1) {

        System.out.println("***** RULETA RUSA *****");
        System.out.println("¿Cuántos jugadores serán?");
        int cantidadJugadores = leer.nextInt();

        if (cantidadJugadores >= 2 && cantidadJugadores <= 6) {

            for (int i = 1; i <= cantidadJugadores; i++) {
                Jugador j1 = new Jugador();
                j1.setId(i);
                j1.setNombre("Jugador ", j1.getId());
                j1.setMojado(false);
                jugadores.add(j1);
            }
        } else {
            for (int i = 1; i <= 6; i++) {
                Jugador j1 = new Jugador();
                j1.setId(i);
                j1.setNombre("Jugador ", j1.getId());
                j1.setMojado(false);
                jugadores.add(j1);
            }
        }

        juego.setJugadores(jugadores);

        juego.setRevolver(llenarRevolcer());

        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
        System.out.println(juego.getRevolver());
        System.out.println("Fin de la carga");
        System.out.println("");
        return juego;
    }

    public void ronda() {
        juego = llenarJuego(jugadores, juego.getRevolver());

        for (Jugador jugador : juego.getJugadores()) {

            boolean disparo = disparo(juego.getRevolver());

            if (disparo == true) {
                System.out.println("OUCH! " + jugador.getNombre() + " está mojado!");
                System.out.println("*** FIN DEL JUEGO ***");
                break;
            }
        }
    }

}
