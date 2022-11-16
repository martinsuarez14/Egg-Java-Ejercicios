/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionService {
    
    public Operacion crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        Operacion op1 = new Operacion();
        
        System.out.println("INGRESE EL PRIMER VALOR: ");
        op1.setNumero1(leer.nextInt());
        
        System.out.println("INGRESE EL SEGUNDO VALOR: ");
        op1.setNumero2(leer.nextInt());
        
        return op1;
    }
    
    public int sumar(int numero1, int numero2){
        
        int resultado = numero1 + numero2;        
        
        return resultado;
    }
    
    public int restar(int numero1, int numero2){
        
        int resultado = numero1 - numero2;
        
        return resultado;
    }
    
    public int multiplicar(int numero1, int numero2){
        
        int resultado;
        
        if (numero1 == 0 || numero2 == 0){
            resultado = 0;
            return resultado;
        } else {
            resultado = numero1 * numero2;
        
            return resultado;
        }        
    }
    
    public int dividir(int numero1, int numero2){
        
        int resultado;
        
        if (numero1 == 0 || numero2 == 0){
            resultado = 0;
            return resultado;
        } else if (numero1 > numero2) {
            resultado = numero1 / numero2;
            return resultado;
        } else {
            resultado = numero2 / numero1;        
            return resultado;
        }
        
        
    }
        
}
