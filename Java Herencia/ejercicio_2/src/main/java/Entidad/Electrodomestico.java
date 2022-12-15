/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int precio;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {

        letra = Character.toUpperCase(letra);
        
        switch (letra) {
            
            case 'A': 
                return letra;
            case 'B': 
                return letra;
            case 'C': 
                return letra;
            case 'D': 
                return letra;
            case 'E': 
                return letra;
            case 'F':
                return letra;
            default: return 'F';
        }
        
        
//        return switch (letra) {
//            case 'A' -> letra;
//            case 'B' -> letra;
//            case 'C' -> letra;
//            case 'D' -> letra;
//            case 'E' -> letra;
//            case 'F' -> letra;
//            default -> 'F';
//        };
    }
    
    public String comprobarColor(String color) {
        
        color = color.toLowerCase();
        
        switch (color) {
            
            case "blanco": 
                return color;
            case "negro": 
                return color;
            case "rojo": 
                return color;
            case "azul": 
                return color;
            case "gris": 
                return color;
            default: return "blanco";
        }
        
    }
    
    public void crearElectrodomestico() {
        
        setPrecio(1000);
        System.out.println("Ingrese el color: ");
        setColor(comprobarColor(leer.next()));
        System.out.println("Ingrese el peso: ");
        setPeso(leer.nextInt());
        System.out.println("Ingrese el consumo eléctrico: ");
        setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        
    }
    
    public void precioFinal() {
        
        switch (getConsumoEnergetico()) {
            case 'A': 
                setPrecio(getPrecio() + 1000);
                break;
            case 'B': 
                setPrecio(getPrecio() + 800) ;
                break;
            case 'C': 
                setPrecio(getPrecio() + 600);
                break;
            case 'D': 
                setPrecio(getPrecio() + 500);
                break;
            case 'E': 
                setPrecio(getPrecio() + 300);
                break;
            case 'F': 
                setPrecio(getPrecio() + 100);
                break;
        }
        
        if (getPeso() > 0 && getPeso() < 20){
            setPrecio(getPrecio() + 100);
        } else if (getPeso() > 19 && getPeso() < 50) {
            setPrecio(getPrecio() + 500);
        } else if (getPeso() > 49 && getPeso() < 80) {
            setPrecio(getPrecio() + 800);
        } else {
            setPrecio(getPrecio() + 1000);
        }
    }
    
    
}
