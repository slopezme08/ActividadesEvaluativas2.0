/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

public class Casas extends InmuebleVivienda{
    
    public int pisos;

    public Casas(int ID, int Ae, String Dir, int Hab, int B, int Floor) {
        super(ID, Ae, Dir, Hab, B);
        this.pisos = Floor;
    }
    
    public void impresion(){
        super.impresion();
        System.out.println("Número de pisos: " + pisos);
    }
}
