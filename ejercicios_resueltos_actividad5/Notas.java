/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_resueltos_actividad5;

public class Notas {
    double[] listaN;
    
    public Notas(){
    listaN = new double[5];}
    
    double cPromedio(){
      double suma = 0;
        for(int i = 0; i < listaN.length; i++){
            suma = suma + listaN[i];
        } return (suma/listaN.length);
    }
    
    double cMenor(){
    double menor = listaN[0];
    for(int i = 0; i < listaN.length; i++){
        if(listaN[i] < menor){ menor = listaN[i];}        
    }return menor;
    }
    
    double cMayor(){
    double mayor = listaN[0];
    for(int i = 0; i < listaN.length; i++){
        if(listaN[i] > mayor){
            mayor = listaN[i];}
    }return mayor;
    }
    double cDesviacion(){
     double media = cPromedio();
     double suma = 0;
     for(int i = 0; i < listaN.length; i++){
         suma += Math.pow((listaN[i] - media), 2);
     } double salida = Math.sqrt(suma/listaN.length);
        double salidisima = Math.round(salida);
     return salidisima;
    }
}