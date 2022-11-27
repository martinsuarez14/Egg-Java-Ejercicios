/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, boolean mojado) {
        this.id = id;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre, int id) {
        this.nombre = nombre + id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = false;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id = " + id + ",\n "
                + "nombre = " + nombre + ", \n"
                + "mojado = " + mojado + '}';
    }
    
    
    
}
