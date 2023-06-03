/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

/**
 *
 * @author User
 */
public class Locales extends Inmuebles{

    public Locales(int ID, int Ae, String Dir, tipo tipoLocal) {
        super(ID, Ae, Dir);
        this.tipoLocal = tipoLocal;
    }
    enum tipo {Interno, Calle};
    public tipo tipoLocal;
    
    public void impresion(){
        super.impresion();
        System.out.println("Tipo de Local: " + tipoLocal);
    }
    
}
