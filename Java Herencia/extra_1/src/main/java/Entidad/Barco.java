/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


/**
 *
 * @author Usuario
 */
public class Barco{
    
    protected String matricula;
    protected int eslora;
    protected int añoDeFabricacion;

    public Barco(String matricula, int eslora, int añoDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public Barco() {
    }

    public Barco(int eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public int modulo(){
        return eslora * 10;
    }

    
    
    
    
}
