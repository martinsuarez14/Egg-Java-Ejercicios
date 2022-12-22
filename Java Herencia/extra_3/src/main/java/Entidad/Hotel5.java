/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public final class Hotel5 extends Hotel4 {

    protected int cantSalonesDeConferencia;
    protected int cantSuites;
    protected int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalonesDeConferencia, int cantSuites, int cantLimosinas, char gimnasio, String nombreDelRestaurante, int capacidadDelRestaurante, int cantDeHabitaciones, int cantDeCamas, int cantPisos, String nombre, String direccion, String Localidad, String gerente) {
        super(gimnasio, nombreDelRestaurante, capacidadDelRestaurante, cantDeHabitaciones, cantDeCamas, cantPisos, nombre, direccion, Localidad, gerente);
        this.cantSalonesDeConferencia = cantSalonesDeConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesDeConferencia() {
        return cantSalonesDeConferencia;
    }

    public void setCantSalonesDeConferencia(int cantSalonesDeConferencia) {
        this.cantSalonesDeConferencia = cantSalonesDeConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
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
        super.precioHabitaciones();
        setPrecioDeHabitaciones(getPrecioDeHabitaciones() + (15 * getCantLimosinas()));
    }

    public int compare(Hotel t, Hotel t1) {
        return compararPrecio.compare(t, t1);
    }

}
