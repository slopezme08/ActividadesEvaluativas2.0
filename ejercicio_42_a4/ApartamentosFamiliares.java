/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

/**
 *
 * @author User
 */
public class ApartamentosFamiliares extends Aptos{
    public float precioAdmin;
    public double valorMetro = 2000000;

    public ApartamentosFamiliares(int ID, int Ae, String Dir, int Hab, int B, int admin) {
        super(ID, Ae, Dir, Hab, B);
        this.precioAdmin = admin;
    }
    
    public void impresion(){
        super.impresion();
        System.out.println("Valor de la administracion: " + precioAdmin);
        System.out.println();
    }
}
