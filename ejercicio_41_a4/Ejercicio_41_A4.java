/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_41_a4;

import java.util.Scanner;

public class Ejercicio_41_A4 {
    

    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        
        System.out.println("Cuenta de ahorros");
        
        System.out.println("Ingrese saldo inicial: ");
        float saldoAhorro = entradas.nextFloat();
        
        System.out.println("Ingrese tasa de interés anual: ");
        float tasaAhorros = entradas.nextFloat();
        
        CuentaAhorros ScuentaA = new CuentaAhorros(saldoAhorro, tasaAhorros);
        
        System.out.println("Ingresar monto consignacion: ");
        float consignacion = entradas.nextFloat();        
        ScuentaA.consignar(consignacion);
        
        System.out.println("Ingresar cantidad a retirar: ");
        float Retiro = entradas.nextFloat();        
        ScuentaA.retiro(Retiro);
        
        ScuentaA.extracto();
        ScuentaA.imprimirCuenta();       
        
    }
}
