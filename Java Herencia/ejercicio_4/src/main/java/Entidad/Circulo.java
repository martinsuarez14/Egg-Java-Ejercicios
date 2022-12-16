/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Interfaces.calculosFormas;

/**
 *
 * @author Usuario
 */
public class Circulo implements calculosFormas{

    protected double radio;
//    protected double pi = PI;
    
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

    @Override
    public double calcularPerimetroRectangulo(double base, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularAreaRectangulo(double base, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularPerimetroCirculo(double radio) {
        
        return PI * (2 * radio);
    }

    @Override
    public double calcularAreaCirculo(double radio) {
        
        return PI * (Math.pow(radio, 2));
    }
    
}
