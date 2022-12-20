/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


/**
 *
 * @author Usuario
 */
public final class Velero extends Barco {
    
    protected int numeroDeMastiles;

    public Velero() {
    }

    public Velero(int numeroDeMastiles, String matricula, int eslora, int añoDeFabricacion) {
        super(matricula, eslora, añoDeFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public Velero(int numeroDeMastiles, int eslora) {
        super(eslora);
        this.numeroDeMastiles = numeroDeMastiles;
    }


    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
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

    @Override
    public int modulo() {
        return super.modulo() + getNumeroDeMastiles();
    }

    
    
    
    
}
