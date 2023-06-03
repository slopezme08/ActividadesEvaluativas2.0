/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_41_a4;

public class CuentaCorriente extends Cuenta {

    
    public CuentaCorriente(float saldox, float tasaAnual) {
        super(saldox, tasaAnual);
    }
    
    public float sobregiro = 0;
    
    @Override
    public void retiro(float salida){
        super.retiro(salida);
        if(saldo < 0){
            sobregiro += saldo*(-1);
            saldo = 0;            
       }        
    }
    @Override
    public void consignar(float entrada){
        super.consignar(entrada);
        if(sobregiro > 0){
            if(saldo > sobregiro){
                sobregiro = 0;
                saldo -= sobregiro;
            }
            else{
                sobregiro -= saldo;
            }
        }
    }
    @Override
    public void extracto(){
        super.extracto();
    }
    public void imprimirCorriente(){
        int transacciones = retiros + consignaciones;
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("Comision mensual: " + comision);
        System.out.println("Numero de transacciones: " + transacciones);
        System.out.println("Sobregiro de la cuenta: " + sobregiro);
    }
    
}