/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enumeraciones.EstadoCivil;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public final class PersonalServicio extends Empleado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public void cambiarEstadoCivil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cambiarDespacho() {
        System.out.println("PERSONAL DE SERVICIO");
        super.cambiarDespacho();
    }

    public void cambiarSeccion() {

        System.out.println("PERSONAL DE SERVICIO \n"
                + "Ingrese la nueva sección:");
        String opcion = leer.next();

        setSeccion(opcion);

        System.out.println("Sr. " + getNombre() + " " + getApellido() + ", se cambió su sección a -> " + getSeccion() + "\n"
                + "");

    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
