/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_41_a4;

public class Cuenta {
    protected float saldo;
    protected int consignaciones = 0;
    protected int retiros = 0;
    protected float tasaA;
    protected float comision = 0;
    
    public Cuenta(float saldox, float tasaAnual) {
        this.saldo = saldox;
        this.tasaA = tasaAnual;
    }
    
    public void consignar(float dineroC){
        saldo = saldo + dineroC;
        consignaciones ++;
    }
    public void retiro(float dineroS){
        if (dineroS > saldo){
            System.out.println("Usted no tiene suficiente dinero para realizar la operacion");
        }else{           
           saldo = saldo - dineroS;
           retiros ++;           
            }
    }
    public void interesM(){
        float interesMensual = saldo * (tasaA/12);
        saldo += interesMensual;
    
    }
    public void extracto(){       
        saldo -= comision;
        interesM();
    }
    public void imprimirCuenta(){
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("Numero de consignaciones realizadas: " + consignaciones);
        System.out.println("Numero de retiros realizados: " + retiros);        
        System.out.println("Comision mensual de la cuenta: " + comision);
    }
}
