/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String[] vectorAux;

    Ahorcado juego1 = new Ahorcado();

    public Ahorcado crearJuego() {

        System.out.println("Ingrese una palabra: ");
        String palabra = leer.nextLine();

        String[] aux = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);
            juego1.setPalabra(aux);
        }

        System.out.println("Ingrese la cantidad de intentos: ");
        juego1.setJugadasMaximas(leer.nextInt());

        return juego1;
    }

    public void longitud() {
        System.out.println("La palabra tiene " + juego1.getPalabra().length + " caracteres.");
    }

    public void buscar(String letra) {

        vectorAux = juego1.getPalabra();

        for (int i = 0; i < juego1.getPalabra().length; i++) {
            if (vectorAux[i].equalsIgnoreCase(letra)) {
                juego1.setLetrasEncontradas(juego1.getLetrasEncontradas() + 1);
            }
        }
        System.out.println("La letra " + letra + " está en la palabra " + juego1.getLetrasEncontradas() + " veces.");
    }

    public void encontradas(String letra) {

        int contador = 0;
        vectorAux = juego1.getPalabra();

        for (int i = 0; i < juego1.getPalabra().length; i++) {
            if (vectorAux[i].equalsIgnoreCase(letra)) {
                juego1.setLetrasEncontradas(juego1.getLetrasEncontradas() + 1);
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("La letra " + letra + " está " + contador + " veces.");
        } else {
            juego1.setJugadasMaximas(juego1.getJugadasMaximas() - 1);
            System.out.println("La letra " + letra + " no está en la palabra.\n"
                    + "Te quedan " + juego1.getJugadasMaximas() + " vidas.");
        }
    }

    public void intentos() {
        System.out.println("Te quedan " + juego1.getJugadasMaximas() + " intentos.");
    }

    public void Juego() {

        System.out.println("Usuario 1");
        Ahorcado j1 = crearJuego();

        boolean flag = true;
        
        while (flag) {
            System.out.println("Usuario 2 ¿Qué desea realizar?\n"
                    + "1. Longitud de la palabra\n"
                    + "2. Buscar una letra\n"
                    + "3. Intentos restantes");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    longitud();
                    break;
                case 2:
                    System.out.println("Ingrese una letra a buscar: ");
                    String letra = leer.next();
                    encontradas(letra);
                    break;
                case 3:
                    intentos();
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta. \n"
                            + "Intente nuevamente.");
            }

            if (j1.getJugadasMaximas() == 0) {
                System.out.println("PERDISTE");
                flag = false;
            } else if (j1.getLetrasEncontradas() == j1.getPalabra().length){
                System.out.println("GANASTE");
                flag = false;
            } else {
                System.out.println("Intente nuevamente: ");
            }
            
        }
    }
}
