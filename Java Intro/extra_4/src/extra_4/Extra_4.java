/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Ingrese un número entre 1 y 10 para saber su equivalente en romano");
        
        int num = leer.nextInt();
        String romano;
        
        if (num >= 1 && num <= 10){
            switch (num) {
                case 1:
                    romano = "I";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 2:
                    romano = "II";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 3:
                    romano = "III";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 4:
                    romano = "IV";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 5:
                    romano = "V";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 6:
                    romano = "VI";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 7:
                    romano = "VII";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 8:
                    romano = "VIII";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 9:
                    romano = "IX";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
                case 10:
                    romano = "X";
                    System.out.println(num + " en romanos se escribe: " + romano);
                    break;
            }
        
       
        }
    }
    
}
