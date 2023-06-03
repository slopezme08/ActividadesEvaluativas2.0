/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_48_a4;

public class Ejercicio_48_A4 {

    public static void main(String[] args) {
        Equipo e1 = new Equipo("Sky","Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25) {
            @Override
            String impresion() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10) {
            @Override
            String impresion() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120) {
            @Override
            String impresion() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        e1.aCiclista(velocista1);
        e1.aCiclista(escalador1);
        e1.aCiclista(contrarrelojista1);
        velocista1.setTeimpoA(365);
        escalador1.setTeimpoA(385);
        contrarrelojista1.setTeimpoA(370);
        e1.calcTtiempo();
        e1.imprimir();
        e1.lEquipo();
    }
}
