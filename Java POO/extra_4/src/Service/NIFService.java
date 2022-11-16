/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNif(){
        
        NIF n1 = new NIF();
        
        System.out.println("Ingrese su DNI todo junto y sin puntos");
        n1.setDNI(leer.nextLong());
        
        n1.setLetra(calcularLetra(n1));
        
        return n1;
    }
    
    public void mostrar(NIF n1){
        
        System.out.println(n1.getDNI() + "-" + n1.getLetra());
        
    }
    
    public String calcularLetra(NIF n1){
        
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        String[] vector = new String[cadena.length()];
        
        for (int i = 0; i < cadena.length(); i++) {
            vector[i] = cadena.substring(i, i + 1);
        }
        
        int resto = (int) (n1.getDNI() % 23);
        
        String letra = vector[resto];
        
        return letra;
    }
    
    
}
