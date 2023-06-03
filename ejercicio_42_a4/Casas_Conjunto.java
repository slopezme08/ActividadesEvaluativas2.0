/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

/**
 *
 * @author User
 */
public class Casas_Conjunto extends CasaUrbana{
    public float precioAdmin;
    public boolean piscina;
    public boolean campoDep;
    public static double valorMetro = 2500000;
    
    public Casas_Conjunto(int ID, int Ae, String Dir, int Hab, int B, int Floor, boolean pis, boolean dep, float admin) {
        super(ID, Ae, Dir, Hab, B, Floor);
        this.campoDep = dep;
        this.piscina = pis;
        this.precioAdmin = admin;
    }
    
    public void impresion(){
        super.impresion();
        System.out.println("Valor de la administracion: " + precioAdmin);
        System.out.println("Tiene piscina?: " + piscina);
        System.out.println("Tiene campos deportivos?: " + campoDep);
        System.out.println();
    }
}
