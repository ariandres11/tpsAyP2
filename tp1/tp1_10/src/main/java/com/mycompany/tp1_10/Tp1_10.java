/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_10;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Tp1_10 {

    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números a introducir: ");
        int cantidad = teclado.nextInt();
        System.out.println("Ingrese un número: ");
        int num = teclado.nextInt();
        int menor = num;
        
        for (int i = 0; i < cantidad-1; i++) {
            System.out.println("Ingrese un número: ");
            num = teclado.nextInt();
            if (num<menor) {
                menor = num;
            }
        }
        System.out.println("El menor es: "+ menor);
    }
}
