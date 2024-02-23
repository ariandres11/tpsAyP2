/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_9;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Tp1_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = teclado.nextInt();
        int mayor = num;
        int menor = num;
        
         for (int i = 0; i <= 9; i++) {
           System.out.println("Ingrese un número");
           num = teclado.nextInt();
             if (num<menor) {
                 //Nuevo menor
                 menor = num;
             }else{
                 if (num>mayor) {
                     //Nuevo mayor
                     mayor = num;
                 }
             }
         }
         System.out.println("Mayor: "+mayor);
         System.out.println("Mayor: "+menor);
         
    }
}
