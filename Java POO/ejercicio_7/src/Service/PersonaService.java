/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona p1 = new Persona();

        System.out.print("Ingrese su nombre: ");
        p1.setNombre(leer.next());

        System.out.print("Ingrese su edad: ");
        p1.setEdad(leer.nextInt());

        boolean flag = true;

        while (flag) {

            System.out.print("Ingrese su sexo: Masculino (M), Femenino (F), Otro (O)");
            String sexo = leer.next();
            sexo = sexo.toUpperCase();
            if (sexo.equals("M") || sexo.equals("F") || sexo.equals("O")) {
                p1.setSexo(sexo);
                flag = false;
            } else {
                System.out.println("Ingreso erróneo");
            }
        }

        /*System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int año = leer.nextInt();

        Date fechaDeNacimiento = new Date();

        fechaDeNacimiento.setDate(dia);
        fechaDeNacimiento.setMonth(mes);
        fechaDeNacimiento.setYear(año);

        p1.setFechaDeNacimiento(fechaDeNacimiento);
*/
        return p1;
    }

    public void mostrarFecha(Persona p1) {

        System.out.println("Fecha de Nacimiento: \n"
                + "Día: " + p1.getFechaDeNacimiento().getDate() + "\n"
                + "Mes: " + p1.getFechaDeNacimiento().getMonth() + "\n"
                + "Año: " + p1.getFechaDeNacimiento().getYear() + "\n");

    }

    public int calcularMC(Persona p1){
        
        int ideal;
        
        System.out.print("Ingrese su peso: ");
        double peso = leer.nextDouble();

        System.out.print("Ingrese su altura:  ");
        double altura = leer.nextDouble();

        double pesoPaciente = peso / (Math.pow(altura, 2));

        if (pesoPaciente < 20) {
            ideal = -1;
        } else if (pesoPaciente >= 20 && pesoPaciente <= 25) {
            ideal = 0;
        } else {
            ideal = 1;
        }
        return ideal;
    }

    public boolean esMayorDeEdad(Persona p1) {

        boolean edad;

        edad = p1.getEdad() >= 18;

        return edad;
    }

}
