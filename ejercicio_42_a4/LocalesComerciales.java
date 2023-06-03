/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

/**
 *
 * @author User
 */
public class LocalesComerciales extends Locales{
    public String centroComercial;
    public static double valorMetro = 3000000;
    

    public LocalesComerciales(int ID, int Ae, String Dir, tipo tipoLocal, String Mall) {
        super(ID, Ae, Dir, tipoLocal);
        this.centroComercial = Mall;
    }
    
    public void impresion(){
        super.impresion();
        System.out.println("Centro comercial: " + centroComercial);
        System.out.println();
    }
}
