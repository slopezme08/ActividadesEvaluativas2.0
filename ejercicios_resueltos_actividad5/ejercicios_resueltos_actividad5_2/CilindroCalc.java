/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad5_2;


public class CilindroCalc extends Figuras {
        private final double radio; 
        private final double altura;
   
    
    public CilindroCalc(double entradaR, double entradaA) {
        this.radio = entradaR;
        this.altura = entradaA;
        this.EstablecerVolumen(calcularVolumen()); 
        this.EstablecerArea(calcularArea()); 
    }

    public double calcularVolumen() {
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return Math.round(volumen);
    } 

    public double calcularArea() {
        double areaLateral = 2.0 * Math.PI * radio * altura;
        double areaCaras = 2.0 * Math.PI * Math.pow(radio, 2.0);
        return Math.round(areaLateral + areaCaras);
    }
}   

