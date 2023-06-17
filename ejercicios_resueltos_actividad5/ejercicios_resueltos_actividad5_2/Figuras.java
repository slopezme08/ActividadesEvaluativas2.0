/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad5_2;

public class Figuras {
    private double volumen; 
    private double area; 

    public void EstablecerVolumen(double entradaV) {
        this.volumen = entradaV;
    }
    
    public void EstablecerArea(double entradaA) {
        this.area = entradaA;
    }

    public double TraerVolumen() {
        return this.volumen;
    }

    public double TraerArea() {
        return this.area;
    } 
    }
