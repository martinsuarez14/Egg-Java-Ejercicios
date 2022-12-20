/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Alquiler {
    
    protected String nombreCompleto;
    protected int dni;
    protected Date fechaDeAlquiler;
    protected Date fechaDeDevolucion;
    protected String posicionDelAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(Date fechaDeAlquiler, Date fechaDeDevolucion, Barco barco) {
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.barco = barco;
    }

    public Alquiler(String nombreCompleto, int dni, Date fechaDeAlquiler, Date fechaDeDevolucion, String posicionDelAmarre, Barco barco) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionDelAmarre = posicionDelAmarre;
        this.barco = barco;
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

    public Date getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(Date fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getPosicionDelAmarre() {
        return posicionDelAmarre;
    }

    public void setPosicionDelAmarre(String posicionDelAmarre) {
        this.posicionDelAmarre = posicionDelAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int precioDelAlquiler(Barco b1){
        
        int milisegundosPorDia = 86400000;
        int dias = (int)((getFechaDeDevolucion().getTime() - getFechaDeAlquiler().getTime()) / milisegundosPorDia);
        
        return b1.modulo() * dias;
    }
    
    
}
