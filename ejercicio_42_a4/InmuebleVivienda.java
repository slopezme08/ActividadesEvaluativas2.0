/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

public class InmuebleVivienda extends Inmuebles{
        
    public int habitaciones;
    public int baños;            

    public InmuebleVivienda(int ID, int Ae, String Dir, int Hab, int B) {
        super(ID, Ae, Dir);
        this.habitaciones = Hab;
        this.baños = B;
    }
    
    public void impresion(){
        super.impresion();
        System.out.println("Numero de habitaciones: " + habitaciones);
        System.out.println("Numero de baños: " + baños);
       
    }
    
}

