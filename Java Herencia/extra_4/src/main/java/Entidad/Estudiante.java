/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public final class Estudiante extends Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, int dni, EstadoCivil estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
        System.out.println("Seleccione su nuevo Estado Civil: \n"
                + "1. Soltero\n"
                + "2. Casado\n"
                + "3. Divorciado\n"
                + "4. Viudo\n"
                + "5. Concubinato\n"
                + "6. Otro");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                setEstadoCivil(EstadoCivil.SOLTERO);
                break;
            case 2:
                setEstadoCivil(EstadoCivil.CASADO);
                break;
            case 3:
                setEstadoCivil(EstadoCivil.DIVORCIADO);
                break;
            case 4:
                setEstadoCivil(EstadoCivil.VIUDO);
                break;
            case 5:
                setEstadoCivil(EstadoCivil.CONCUBINATO);
                break;
            case 6:
                setEstadoCivil(EstadoCivil.OTRO);
                break;
            default:
                setEstadoCivil(EstadoCivil.SOLTERO);
        }
        System.out.println("Se cambió su Estado Civil a -> " + getEstadoCivil());
    }

    public void nuevaMatriculacion() {

        System.out.println("ESTUDIANTES\n"
                + "Ingrese a qué curso se quiere matricular: \n"
                + "1. Arquitectura\n"
                + "2. Historia del Arte\n"
                + "3. Medicina\n"
                + "4. Derecho");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                setCurso("Arquitectura");
                break;
            case 2:
                setCurso("Historia del Arte");
                break;
            case 3:
                setCurso("Medicina");
                break;
            case 4:
                setCurso("Derecho");
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
        System.out.println("Alumno " + getNombre() + " " + getApellido() + ", se matriculó en -> " + getCurso() + "\n"
                + "");
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
    }

    

}
