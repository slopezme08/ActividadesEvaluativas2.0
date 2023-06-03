/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

/**
 *
 * @author User
 */
public class Oficinas extends Locales{
    public boolean publicas;
    public static double valorMetro = 3500000;

    public Oficinas(int ID, int Ae, String Dir, tipo tipoLocal, boolean pub) {
        super(ID, Ae, Dir, tipoLocal);
        this.publicas = pub;
    }
    
    public void impresion(){
        super.impresion();
        System.out.println("Es oficina gubernamental: " + publicas);
        System.out.println();
    }
}
