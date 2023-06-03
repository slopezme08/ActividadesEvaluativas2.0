/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_48_a4;

public abstract class Contrarrelojista extends Ciclista{
    private double velocidadM;
    
    public Contrarrelojista(int identificado, String name, double velocidades) {
        super(identificado, name);
        this.velocidadM = velocidades;
    }
    protected double getVelocidadM(){
        return velocidadM;
    }
    protected void setVelocidadM(double velocidades){
        this.velocidadM = velocidades;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio: " + velocidadM);
    }
    protected String imprimirT(){
        return "Es un contrarrelojista";
    }
}
