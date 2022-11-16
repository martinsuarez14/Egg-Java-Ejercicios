/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CadenaServicio cadServicio = new CadenaServicio();
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una palabra o frase: ");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        
        System.out.println(c1.toString());        
        
        cadServicio.mostrarVocales(c1);
        cadServicio.invertirFrase(c1);
        cadServicio.vecesRepetido(c1);
        
        System.out.println("Ingrese otra palabra o frase: ");
        String cadena2 = leer.nextLine();
        
        if (cadServicio.compararLongitud(c1, cadena2) == true){
            System.out.println("Las cadenas tienen la misma cantidad de caracteres.");
        } else {
            System.out.println("Las cadenas no tienen la misma cantidad de caracteres.");
        }
        
        String cadenaUnida = cadServicio.unirFrases(c1, cadena2);
        
        System.out.println(cadenaUnida);
        
        cadServicio.reemplazar(c1);
        
        System.out.println("Ingrese una letra para ver si la contiene: ");
        String letra1 = leer.next();
        
        if (cadServicio.contiene(c1, letra1) == true){
            System.out.println("La frase contiene el caracter ingresado");
        } else {
            System.out.println("La frase no contiene el caracter");
        }
        
    }
    
}
