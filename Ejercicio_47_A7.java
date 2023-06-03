/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4._a7;

public class Ejercicio_47_A7 {

    public static void main(String[] args) {
        Animal[] anima = new Animal[4]; 
        anima[0] = new Gatos();
        anima[1] = new Perros();
        anima[2] = new Lobos();
        anima[3] = new Leones();
        for(int i = 0; i < anima.length; i++) {
            System.out.println(anima[i].getNombreC());
            System.out.println("Sonido: " + anima[i].getSonido());
            System.out.println("Alimentos: " + anima[i].getAlimentos()); 
            System.out.println("Hábitat: " + anima[i].getHabitat());
            System.out.println();
        }
        
    }
}

