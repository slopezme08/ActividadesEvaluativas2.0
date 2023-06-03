/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_41_a4;

public class CuentaAhorros extends Cuenta{

    
    public CuentaAhorros(float saldox, float tasaAnual) {
        super(saldox, tasaAnual);
    }
    public boolean estado = true;
    
    public void Estado(){
        estado = saldo >= 10000;
    }
    
    @Override
    public void consignar(float dinero){
        if(estado){
        super.consignar(dinero);
        }else{
            System.out.println("Cuenta Inactiva");
        }
    }
    @Override
    public void retiro(float salida){
        if(estado == true){
        super.retiro(salida);
        }else{
            System.out.println("Cuenta Inactiva");
        }
    }
    public void Extracto(){
        if(retiros > 4){
        comision = (retiros - 4)* 1000;
        }
       super.extracto();
       Estado();
    }
    public void imprimirAhorros(){
        int transacciones = retiros + consignaciones;
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("Comision mensual de la cuenta: " + comision);
        System.out.println("Numero de transacciones: " + transacciones);
    }
}