/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

/**
 *
 * @author User
 */
public class ApartaEstudio extends Aptos{
    public double valorMetro = 1500000;

    public ApartaEstudio(int ID, int Ae, String Dir, int Hab, int B) {
        super(ID, Ae, Dir, 1, 1);
    }
    public void impresion(){
        super.impresion();
        System.out.println();
    }
}
