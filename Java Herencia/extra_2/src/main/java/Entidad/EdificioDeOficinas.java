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
public class EdificioDeOficinas extends Edificio {
 
    protected int numeroDeOficinas;
    protected int personasPorOficina;
    protected int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int personasPorOficina, int numeroDePisos) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public EdificioDeOficinas(int numeroDeOficinas, int personasPorOficina, int numeroDePisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    
    public void cantPersonas() {
        System.out.println("* La capacidad de personas por piso es de: " + getPersonasPorOficina() + "\n"
                + "* La capacidad de personas del edificio es de: " + (getPersonasPorOficina() * getNumeroDePisos()));
    }

    @Override
    public double calcularVolumen(){
        return getLargo() * getAncho() * getAlto();
    }
    
    @Override
    public double calcularSuperficie() {
        return getAncho() * getLargo();
    }
    
    
}
