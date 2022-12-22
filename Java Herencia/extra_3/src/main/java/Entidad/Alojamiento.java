/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public abstract class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String Localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String Localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Localidad = Localidad;
        this.gerente = gerente;
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
