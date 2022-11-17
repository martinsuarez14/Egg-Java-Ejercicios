/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ciudad;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCiudad {

    Ciudad c1 = new Ciudad();

    private Scanner leer;

    private HashMap<Integer, String> ciudades;

    public ServicioCiudad() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ciudades = new HashMap<>();
    }

    public void ingresar() {
        String opcion;
        do {
            System.out.println("Ingrese el código poostal: ");
            c1.setCodigoPostal(leer.nextInt());
            System.out.println("Ingrese el nombre de la ciudad: ");
            c1.setNombre(leer.next());

            ciudades.put(c1.getCodigoPostal(), c1.getNombre());

            System.out.println(".....................");
            System.out.println("Desea ingresar más ciudades: ");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s"));
    }

    public void mostrarCiudades() {
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + " " + val);
        }
        System.out.println(".....................");
    }

    public void buscarCiudad() {
        System.out.println("Ingrese el código postal: ");
        int codigo = leer.nextInt();
        if (ciudades.containsKey(codigo)) {

            for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                if (key.equals(codigo)) {
                    System.out.println("La ciudad es: " + val);
                }
            }
        } else {
            System.out.println("La ciudad no se encuentra.");
        }
        System.out.println("");

    }

    public void eliminarCiudad() {
        System.out.println("Ingrese el codigo postal de la ciudad a eliminar: ");
        int codigo = leer.nextInt();
        if (ciudades.containsKey(codigo)) {
            ciudades.remove(codigo);
        } else {
            System.out.println("No se encontró");
        }
        System.out.println("");
    }

    public void menu() {
        int opcion;

        do {
            System.out.println("---MENÚ---\n"
                    + "1. Ingresar ciudades\n"
                    + "2. Mostrar una ciudad\n"
                    + "3. Eliminar una ciudad\n"
                    + "4. Mostrar\n"
                    + "5. Salir\n");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    buscarCiudad();
                    break;
                case 3:
                    eliminarCiudad();
                    break;
                case 4:
                    mostrarCiudades();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Dato err+oneo");
            }

        } while (opcion != 5);

    }
    
    public void mostrarOrdenCP(){
        System.out.println("ORDENADAS POR CÓDIGO POSTAL");
        ciudades.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry->System.out.println(entry.getKey()+" - "+entry.getValue()));
        System.out.println("................");
    }
    public void mostrarOrdenCity(){
        System.out.println("ORDENADAS POR CIUDAD");
        ciudades.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry->System.out.println(entry.getValue()+" - "+entry.getKey()));
        System.out.println("................");
        
    }


}
