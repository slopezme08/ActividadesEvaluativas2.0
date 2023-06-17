/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad5_2;

public class PiramideCalc extends Figuras {
    private double base; 
    private double altura; 
    private double apotema; 
    public PiramideCalc(double entradaB, double entradaA, double entradaAp) {
        this.base = entradaB;
        this.altura = entradaA;
        this.apotema = entradaAp;
        this.EstablecerVolumen(calcularVolumen()); 
        this.EstablecerArea(calcularArea()); 
    }

    public double calcularVolumen() {
        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
        return Math.round(volumen);
    }

    public double calcularArea() {
        double AreaBase = Math.pow(base, 2.0);
        double AreaLados = 2.0 * base * apotema;
        return Math.round(AreaBase + AreaLados);
    }
}

