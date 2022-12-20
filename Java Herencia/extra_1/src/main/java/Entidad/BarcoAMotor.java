/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class BarcoAMotor extends Barco {
    
    protected int potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaCV, String matricula, int eslora, int añoDeFabricacion) {
        super(matricula, eslora, añoDeFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public BarcoAMotor(int potenciaCV, int eslora) {
        super(eslora);
        this.potenciaCV = potenciaCV;
    }

    public BarcoAMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
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
        return super.modulo() + getPotenciaCV();
    }
    
    
}
