/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
import sun.security.util.Length;

/**
 *
 * @author Usuario
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena RS232:");
        
        int correctas = 0;
        int incorrectas = 0;
        String clave = "&&&&&";
        boolean salir = true;
        String cadena;
        
        do {
            
            cadena = leer.nextLine();
            
            if (cadena.equals(clave)){
                break;
            }
            
            
            
            char cadInicio = cadena.charAt(0);
            char cadUltimo = cadena.charAt(cadena.length() - 1);
            
            System.out.println(cadInicio);
            System.out.println(cadUltimo);
            
            String inicio = "X";
            String fin = "O";
                     
            
            if (cadena.length() > 5){
                System.out.println("La frase ingresada tiene más de 5 caracteres");
            }  else {
                if (String.valueOf(cadInicio).equals(inicio) && String.valueOf(cadUltimo).equals(fin)){
                    correctas += 1;
                } else {
                    incorrectas += 1;
                }
            }
            
            
            
        } while (salir = true);

     
            
        
        System.out.println("CORRECTAS: " + correctas);
        System.out.println("");
        System.out.println("INCORRECTAS: " + incorrectas);
        
    }

    
        
       
}
    

