/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_48_a4;

public abstract class Velocista extends Ciclista{
    private double potenciaP;
    private double velocidadP;

    public Velocista(int identificado, String name, double PP, double VP) {
        super(identificado, name);
        this.potenciaP = PP;
        this.velocidadP = VP;
    }
    
    protected double getPotenciaP(){
        return potenciaP;
    }
    protected void setPotencialP(double potenciaPe){
        this.potenciaP = potenciaPe;
    }
    protected double getVelocidadP(){
        return velocidadP;
    }
    protected void setVelocidadP(double velocidadPe){
        this.velocidadP = velocidadPe;
    }
    protected void imprimir(){
       super.imprimir();
       System.out.println("Potencia promedio: " + potenciaP);
       System.out.println("Velocidad promedio: " + velocidadP);       
    }
   protected String imprimirT(){
       return "Es velocista";
   }
}
