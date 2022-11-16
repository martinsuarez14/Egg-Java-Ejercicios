/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).*/
        
        Scanner leer = new Scanner(System.in);
        
        Circunferencia circulo1 = new Circunferencia(16.3);
       
        System.out.println("PRIMER VALOR DEL RADIO: " + circulo1.getRadio());
        
        circulo1.setRadio(12.5);
        
        System.out.println("VALOR CAMBIADO CON SET: " + circulo1.getRadio());
        
        System.out.println("INGRESO EL RADIO: ");
        double radio = leer.nextDouble();
        
       circulo1.crearCircunferencia(radio);
        
        System.out.println("RADIO INGRESADO: " + circulo1.getRadio());
        
        
        circulo1.area();
        circulo1.perimetro();
        
    }


}
