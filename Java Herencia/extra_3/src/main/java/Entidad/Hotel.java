/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public abstract class Hotel extends Alojamiento {

    protected int cantDeHabitaciones;
    protected int cantDeCamas;
    protected int cantPisos;
    protected int precioDeHabitaciones = 50;

    public Hotel() {
    }

    public Hotel(int cantDeHabitaciones, int cantDeCamas, int cantPisos, String nombre, String direccion, String Localidad, String gerente) {
        super(nombre, direccion, Localidad, gerente);
        this.cantDeHabitaciones = cantDeHabitaciones;
        this.cantDeCamas = cantDeCamas;
        this.cantPisos = cantPisos;
    }

    public int getCantDeHabitaciones() {
        return cantDeHabitaciones;
    }

    public void setCantDeHabitaciones(int cantDeHabitaciones) {
        this.cantDeHabitaciones = cantDeHabitaciones;
    }

    public int getCantDeCamas() {
        return cantDeCamas;
    }

    public void setCantDeCamas(int cantDeCamas) {
        this.cantDeCamas = cantDeCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioDeHabitaciones() {
        return precioDeHabitaciones;
    }

    public void setPrecioDeHabitaciones(int precioDeHabitaciones) {
        this.precioDeHabitaciones = precioDeHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t1, Hotel t2) {
            return t2.getPrecioDeHabitaciones() - t1.getPrecioDeHabitaciones();
        }
    };

    public abstract void precioHabitaciones();

}
