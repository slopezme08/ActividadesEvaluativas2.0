/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_48_a4;

public abstract class Escalador extends Ciclista{
    public double aceleracionP;
    public double grados;
    
    public Escalador(int identificador, String nombre, double aceleraciones, double gradoses){
        super(identificador, nombre);
        this.aceleracionP =  aceleraciones;
        this.grados = gradoses;        
    }
    protected double getAceleracionP(){
        return aceleracionP;
    }
    
    protected void setAceleracionP(double aceleraciones){
        this.aceleracionP = aceleraciones;
    }
    protected double getGrados(){
        return grados;
    }
    
    protected void setGrados(double gradoes){
        this.grados = gradoes;
    }
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio: " + aceleracionP);
        System.out.println("Grado de rampa: " + grados);
    }
    protected String imprimirT(){
        return "Es un escalador";
    }
    
}
