/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_42_a4;

public class Inmuebles {
    public int IdInmobiliario;
    public int area;
    public String direccion;
    public double valorVenta;
    
    Inmuebles(int ID, int Ae, String Dir){
        this.IdInmobiliario = ID;
        this.area = Ae;
        this.direccion = Dir;    
    }
    
    public void precioVenta(double valorMetro){
        valorVenta = area * valorMetro;        
    }
    public void impresion(){
        System.out.println("Identificador inmobiliario: " + IdInmobiliario);
        System.out.println("Area: " + area);
        System.out.println("Direccion: " + direccion);
        System.out.println("Precio de Venta: " + valorVenta);
    }
}
