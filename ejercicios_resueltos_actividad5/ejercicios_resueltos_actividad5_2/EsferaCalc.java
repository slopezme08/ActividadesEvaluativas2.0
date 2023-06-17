/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad5_2;

public class EsferaCalc extends Figuras{

    private final double radio;
    
    public EsferaCalc(double entradaR){
        this.radio = entradaR;
        this.EstablecerVolumen(calcularVolumen()); 
        this.EstablecerArea(calcularArea()); 
    }

    public double calcularVolumen() {
        double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
        return Math.round(volumen);
    }

    public double calcularArea() {
        double Area = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        return Math.round(Area);
}
}

