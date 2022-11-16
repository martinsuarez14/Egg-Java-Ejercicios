/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import Entidad.Cuenta;
import Servicio.CuentaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CuentaService cServicio = new CuentaService();
        Cuenta c1 = cServicio.crearCuenta();

        int opcion;
        boolean flag = true;

        while (flag) {
            System.out.println("------------");
            System.out.println("----MENU---- \n"
                    + "1. Ingresar Dinero\n"
                    + "2. Retirar Dinero\n"
                    + "3. Extracción Rápida\n"
                    + "4. Consultar Saldo\n"
                    + "5. Consultar Datos\n"
                    + "6. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cServicio.ingreso(c1);
                    break;
                case 2:
                    cServicio.retirar(c1);
                    break;
                case 3:
                    cServicio.extraccionRapida(c1);
                    break;
                case 4:
                    cServicio.consultarSaldo(c1);
                    break;
                case 5:
                    cServicio.consultarDatos(c1);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("La opción ingresada es errónea. Intente nuevamente");
                    break;
            }

        }

    }

}
