/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import Entidad.Operacion;
import Servicio.OperacionService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        OperacionService opServicio = new OperacionService();
        
        Operacion operacion1 = opServicio.crearOperacion();
        
       
        int resultado;
        int salir = 0;
        
        while (salir != 5) {
            
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            
            int op = leer.nextInt();
            
            switch (op){
                case 1:
                    resultado = opServicio.sumar(operacion1.getNumero1(), operacion1.getNumero2());
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = opServicio.restar(operacion1.getNumero1(), operacion1.getNumero2());
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;    
                case 3:
                    resultado = opServicio.multiplicar(operacion1.getNumero1(), operacion1.getNumero2());
                    if (resultado == 0){
                        System.out.println("Toda multiplicación por 0 (cero), es 0 (Cero). Resultado: " + resultado);
                    } else {
                        System.out.println("El resultado de la multiplicación es: " + resultado);
                    }
                    break;
                case 4:
                    resultado = opServicio.dividir(operacion1.getNumero1(), operacion1.getNumero2());                    
                    if (resultado == 0){
                        System.out.println("No se puede dividir por 0 (Cero). Resultado: " + resultado);
                    } else {
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;    
                case 5:
                    salir = 5;
                    break;    
            }
            
        }
        
        
    }
    
}
