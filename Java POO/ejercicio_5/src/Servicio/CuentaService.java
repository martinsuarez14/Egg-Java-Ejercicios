/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        
        Cuenta c1 = new Cuenta();
        
        System.out.println("INGRESE NUMERO DE CUENTA: ");
        c1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("INGRESE SU DNI: ");
        c1.setDni(leer.nextLong());
        
        System.out.println("INGRESE EL SALDO ACTUAL: ");
        c1.setSaldoActual(leer.nextInt());
        
        return c1;        
    }
    
    public double ingreso(Cuenta c1){
        
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        double deposito = leer.nextDouble();
        
        c1.setSaldoActual((int) (c1.getSaldoActual() + deposito));
        
        return c1.getSaldoActual();
    }
    
    public double retirar(Cuenta c1){
        
        System.out.println("Ingrese la cantidad de dinero que desea extraer");
        double retiro = leer.nextInt();
        
        if (retiro < c1.getSaldoActual()){
            c1.setSaldoActual((int) (c1.getSaldoActual() - retiro));
        } else {
            c1.setSaldoActual(0);
        }
        
        return c1.getSaldoActual();
        
    }
    
    public double extraccionRapida(Cuenta c1){
        
        double saldoDisponible = (c1.getSaldoActual() * 20) / 100;
        
        System.out.println("Ingrese cuánto dinero quiere extraer");
        double retiro = leer.nextInt();
        
        if( retiro > saldoDisponible){
            System.out.println("El monto ingresado supera el 20% de su saldo. \n"
                    + "Ingrese un monto menor.");
        } else {
            c1.setSaldoActual((int) (c1.getSaldoActual() - retiro));
        }
        
        return c1.getSaldoActual();
    }
    
    public void consultarSaldo(Cuenta c1){
        
        System.out.println("El saldo deisponible de su cuenta es: $" + c1.getSaldoActual());
        
    }
    
    public void consultarDatos(Cuenta c1){
        
        System.out.println(c1.toString());
        
    }
    
    
}
