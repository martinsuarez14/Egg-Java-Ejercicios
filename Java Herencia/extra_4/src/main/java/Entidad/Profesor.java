/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enumeraciones.Departamento;
import Enumeraciones.EstadoCivil;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public final class Profesor extends Empleado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Departamento materia;

    public Profesor() {
    }

    public Profesor(Departamento materia, int anioIncorporacion, int numeroDespacho, String nombre, String apellido, int dni, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, dni, estadoCivil);
        this.materia = materia;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Departamento getMateria() {
        return materia;
    }

    public void setMateria(Departamento materia) {
        this.materia = materia;
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
        System.out.println("PROFESOR");
        super.cambiarDespacho();
    }

    public void cambiarDepartamento() {

        System.out.println("PROFESOR \n"
                + "Seleccione su nuevo departamento: \n"
                + "1. Matemática\n"
                + "2. Lenguajes\n"
                + "3. Cs. Naturales\n"
                + "4. Cs. Sociales\n"
                + "5. Educación Física\n"
                + "6. Música\n"
                + "7. Arquitectura\n"
                + "8. Filosofía");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                setMateria(Departamento.MATEMATICA);
                break;
            case 2:
                setMateria(Departamento.LENGUAJES);
                break;
            case 3:
                setMateria(Departamento.CS_NATURALES);
                break;
            case 4:
                setMateria(Departamento.CS_SOCIALES);
                break;
            case 5:
                setMateria(Departamento.EDUCACION_FISICA);
                break;
            case 6:
                setMateria(Departamento.MUSICA);
                break;
            case 7:
                setMateria(Departamento.ARQUITECTURA);
                break;
            case 8:
                setMateria(Departamento.FILOSOFIA);
                break;
            default:
                System.out.println("Opción errónea.");
        }
        System.out.println("Se cambió su materia a -> " + getMateria());
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
