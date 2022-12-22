/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public abstract class AlojamientoExtraHotelero extends Alojamiento{
    
    protected boolean privado = false;
    protected int metrosCuadrados;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public AlojamientoExtraHotelero(int metrosCuadrados, String nombre, String direccion, String Localidad, String gerente) {
        super(nombre, direccion, Localidad, gerente);
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
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
    
    
    
}
