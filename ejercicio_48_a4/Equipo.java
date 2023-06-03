/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_48_a4;

import java.util.*;
public class Equipo{
    private String equipo;
    private static double tiempo;
    private String pais;
    Vector listaC;
    
    public Equipo(String name, String country){
        this.equipo = name;
        this.pais = country;
        tiempo = 0;
        listaC = new Vector();
    }
    
    public String getNombre(){
        return equipo;
    }
    
    public void setNombre(String noombre){
        this.equipo = noombre;
    }
    private String getPais(){
        return pais;
    }
    private void setPais(String coun){
        this.pais = pais;
    }
    void aCiclista(Ciclista ciclista){
        listaC.add(ciclista);
    }
    void lEquipo(){
        for(int i = 0; i < listaC.size(); i++){
            Ciclista c = (Ciclista)listaC.elementAt(i);
            System.out.println(c.getNombre());
        }
    }
    void bCiclista(){
        Scanner sc = new Scanner(System.in);
        String nCiclista = sc.next();
        for(int i = 0; i < listaC.size(); i++){
            Ciclista c = (Ciclista)listaC.elementAt(i);
            if(c.getNombre().equals(nCiclista)){
                System.out.println(c.getNombre());
            }
        }
    }
    void calcTtiempo(){
        for (int i = 0; i < listaC.size(); i++){
            Ciclista c = (Ciclista)listaC.elementAt(i);
            tiempo = tiempo + c.getTiemA();
        }
    }
    
    void imprimir(){
        System.out.println("Nombre del equipo: " + equipo);
        System.out.println("Pais: " + pais);
        System.out.println("Total tiempo del equipo: " + tiempo);
    }
            
}
