/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Hotel4 extends Hotel{
    
    protected char gimnasio;
    protected String nombreDelRestaurante;
    protected int capacidadDelRestaurante;

    public Hotel4() {
    }
    
    public Hotel4(char gimnasio, String nombreDelRestaurante, int capacidadDelRestaurante, int cantDeHabitaciones, int cantDeCamas, int cantPisos, String nombre, String direccion, String Localidad, String gerente) {
        super(cantDeHabitaciones, cantDeCamas, cantPisos, nombre, direccion, Localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreDelRestaurante = nombreDelRestaurante;
        this.capacidadDelRestaurante = capacidadDelRestaurante;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreDelRestaurante() {
        return nombreDelRestaurante;
    }

    public void setNombreDelRestaurante(String nombreDelRestaurante) {
        this.nombreDelRestaurante = nombreDelRestaurante;
    }

    public int getCapacidadDelRestaurante() {
        return capacidadDelRestaurante;
    }

    public void setCapacidadDelRestaurante(int capacidadDelRestaurante) {
        this.capacidadDelRestaurante = capacidadDelRestaurante;
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

    @Override
    public void precioHabitaciones() {
        
        setPrecioDeHabitaciones(getPrecioDeHabitaciones() + getCantDeCamas());
        
        if (getCapacidadDelRestaurante() < 30) {
            setPrecioDeHabitaciones(getPrecioDeHabitaciones() + 10);
        } else if (getCapacidadDelRestaurante() >= 30 && getCapacidadDelRestaurante() <= 50) {
            setPrecioDeHabitaciones(getPrecioDeHabitaciones() + 30);
        } else {
            setPrecioDeHabitaciones(getPrecioDeHabitaciones() + 50);
        }
        
        if (getGimnasio() == 'A') {
            setPrecioDeHabitaciones(getPrecioDeHabitaciones() + 50);
        } else {
            setPrecioDeHabitaciones(getPrecioDeHabitaciones() + 30);
        }
    }

    public int compare(Hotel t, Hotel t1) {
        return compararPrecio.compare(t, t1);
    }
    
    
}
