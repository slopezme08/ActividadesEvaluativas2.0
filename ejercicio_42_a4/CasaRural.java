/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

/**
 *
 * @author User
 */
public class CasaRural extends Casas{
    
    public float distaciaCabecera;
    public float altitudSNM;
    public static double valorMetro = 1500000;

    public CasaRural(int ID, int Ae, String Dir, int Hab, int B, int Floor,
            int DC, int ASNM) {
        super(ID, Ae, Dir, Hab, B, Floor);
        this.distaciaCabecera = DC;
        this.altitudSNM = ASNM;
    }
    
    public void impresion(){
        super.impresion();
        System.out.println("Distancia a la cabecera municipal: " + distaciaCabecera + "Kms");
        System.out.println("Altitud sobre el nivel del mar: " + altitudSNM + " metros");
        System.out.println();
        
    }
}
