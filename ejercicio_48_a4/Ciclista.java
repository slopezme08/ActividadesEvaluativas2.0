/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_48_a4;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempo = 0;
    
    public Ciclista(int identificado, String name){
    this.identificador = identificado;
    this.nombre = name;
    }
    abstract String impresion();
    protected int getIdentificador(){
        return identificador;        
    }
    protected void setIdentificador(){
        this.identificador = identificador;
    }
    protected String getNombre(){
        return nombre;
    }
    
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    protected int getPosG(int pos){
        return pos;
    }
    protected void setPosG(int pos){
        pos = pos;
    }
    protected int getTiemA(){
        return tiempo;
    }
    protected void setTeimpoA(int Atime){
        this.tiempo = Atime;
    }
    protected void imprimir(){
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo Acumulado: " + tiempo);
    }
}
