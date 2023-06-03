/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_42_a4;

public class Ejercicio_42_A4 {

    public static void main(String[] args) {
        ApartamentosFamiliares inm1 = new ApartamentosFamiliares(103067, 120, "Calle 1 #2 - 3", 3, 2, 2000000);
        
        System.out.println("Datos Inmueble");
        inm1.precioVenta(inm1.valorMetro);
        inm1.impresion();
        
        System.out.println("Datos Inmueble");
        ApartaEstudio inm2 = new ApartaEstudio(12345, 50, "Calle 4 #5 - 6", 1, 1);
        inm2.precioVenta(inm2.valorMetro);
        inm2.impresion();        
    }
}
