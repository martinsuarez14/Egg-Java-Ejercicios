/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Polideportivo extends Edificio {
    
    protected String nombre;
    protected String tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoDeInstalacion) {
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
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
    
    @Override
    public double calcularVolumen(){
        return getLargo() * getAncho() * getAlto();
    }
    
    @Override
    public double calcularSuperficie() {
        return getAncho() * getLargo();
    }

    
    
    
}
