/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp1_11;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Tp1_11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int vector[]= new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un número entre 1 y 30");
            num = teclado.nextInt();
            if (num >= 1 && num <= 30) {
                vector[i]=num;
            }else{
                System.out.println("Número no válido");
            }     
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 0; j < vector[i]; j++) {
                
                System.out.print("*");
            }
        }
    }
}
