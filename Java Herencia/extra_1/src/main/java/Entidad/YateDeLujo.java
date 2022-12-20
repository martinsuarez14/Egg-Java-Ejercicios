/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public final class YateDeLujo extends BarcoAMotor {
    
    protected int numeroDeCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public YateDeLujo(int numeroDeCamarotes, int potenciaCV, String matricula, int eslora, int añoDeFabricacion) {
        super(potenciaCV, matricula, eslora, añoDeFabricacion);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public YateDeLujo(int numeroDeCamarotes, int potenciaCV, int eslora) {
        super(potenciaCV, eslora);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public YateDeLujo(int numeroDeCamarotes, int potenciaCV) {
        super(potenciaCV);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
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
        return super.modulo() + getPotenciaCV() + getNumeroDeCamarotes();
    }

}
