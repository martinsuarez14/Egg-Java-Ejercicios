/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alumno {

    private String nombreCompleto;
    private int dni;
    private int cantidadDeVotos;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dni, int cantidadDeVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    @Override
    public String toString() {
        return "Alumno{ " + "Nombre: " + nombreCompleto + ", \n"
                + "DNI: " + dni + ", \n"
                + "Votos: " + cantidadDeVotos + '}';
    }

}
