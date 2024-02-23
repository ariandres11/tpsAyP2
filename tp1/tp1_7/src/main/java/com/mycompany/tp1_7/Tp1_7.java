/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_7;

/**
 *
 * @author ariel
 */
public class Tp1_7 {

    public static void main(String[] args) {
        double cuadrado;
        double cubo;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Número: "+i);
            cuadrado = Math.pow(i,2);
            cubo = Math.pow(i,3);
            System.out.println("Cuadrado: "+ cuadrado);
            System.out.println("Cubo: "+ cubo);
        }
    }
}
