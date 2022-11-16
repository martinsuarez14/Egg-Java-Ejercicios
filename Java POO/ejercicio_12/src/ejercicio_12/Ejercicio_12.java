/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaService pService = new PersonaService();
        
        Persona p1 = pService.crearPersona();
        
        pService.calcularEdad(p1);

        Persona p2 = pService.crearPersona();
                
        pService.menorQue(p1, p2);

        pService.mostrarPersona(p1);
    }
    
}
