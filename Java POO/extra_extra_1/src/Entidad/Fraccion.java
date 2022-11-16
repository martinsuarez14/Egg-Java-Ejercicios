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
public final class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador == 0) {
            denominador = 1;
        }
        this.denominador = denominador;
        simplificar();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int mcd() {
        int u = Math.abs(numerador);
        int v = Math.abs(denominador);
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public Fraccion sumar(Fraccion f2) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f2.denominador + this.denominador * f2.numerador;
        aux.denominador = this.denominador * f2.denominador;
        aux.simplificar();
        return aux;
    }

    public Fraccion restar(Fraccion f2) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f2.denominador - this.denominador * f2.numerador;
        aux.denominador = this.denominador * f2.denominador;
        aux.simplificar();
        return aux;
    }

    public Fraccion multiplicar(Fraccion f2) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f2.numerador;
        aux.denominador = this.denominador * f2.denominador;
        aux.simplificar();
        return aux;
    }
    
    public Fraccion dividir(Fraccion f2){
         Fraccion aux = new Fraccion();
         aux.numerador = this.numerador * f2.denominador;
        aux.denominador = this.denominador * f2.numerador;
        aux.simplificar();
        return aux;
    }

    public void simplificar(){
        int n = mcd();
        numerador = numerador / n;
        denominador = denominador / n;
    }
    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }

}
