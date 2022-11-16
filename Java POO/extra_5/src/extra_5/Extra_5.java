/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] meses = new String[12];

        meses[0] = "enero";
        meses[1] = "febrero";
        meses[2] = "marzo";
        meses[3] = "abril";
        meses[4] = "mayo";
        meses[5] = "junio";
        meses[6] = "julio";
        meses[7] = "agosto";
        meses[8] = "septiembre";
        meses[9] = "octubre";
        meses[10] = "noviembre";
        meses[11] = "diciembre";

        int mesSecreto = (int) (Math.random() * 12);
        System.out.println(mesSecreto);
        boolean flag = true;

        while (flag) {
            System.out.println("Adivine el mes del año");

            String usuario = leer.nextLine();

            if (usuario.equalsIgnoreCase(meses[mesSecreto])) {
                System.out.println("¡Ha acertado!");
                flag = false;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        }

    }

}
