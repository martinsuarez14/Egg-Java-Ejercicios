/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_2;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author Usuario
 */
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        int A = 2; 
        int B = 4;
        int C = 6;
        int D = 8;
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        int aux = B;
        
        B = C;
        
        C = A;
        
        A = D;
        
        D = aux;
        
        System.out.println("Ahora el valor de A es: " + A);
        System.out.println("Ahora el valor de B es: " + B);
        System.out.println("Ahora el valor de C es: " + C);
        System.out.println("Ahora el valor de D es: " + D);
                
    }
    
    
    
}
