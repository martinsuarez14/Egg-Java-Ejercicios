/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio = radio;
        System.out.println("El radio es: " + radio);
    }
    
    public void area(){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("EL AREA DEL CIRCULO ES: " + area);
        }
    public void perimetro(){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("EL PERÍMETRO ES: " + perimetro);
    }
}

