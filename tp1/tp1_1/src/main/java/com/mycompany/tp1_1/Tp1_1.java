/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_1;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Tp1_1 {

    public static void main(String[] args) {
        int n1;
        int n2;
        int numOp;
        int res;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n1 = teclado.nextInt();
        System.out.println("Ingrese otro número");
        n2 = teclado.nextInt();
        
        System.out.println("Ingrese el número de operación requerida");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        numOp= teclado.nextInt();
        if (numOp==1) {
            //Suma
            res = n1 + n2;
            System.out.println("El resultado es "+ res);
        }else{
            if (numOp==2) {
                res = n1 - n2;
                System.out.println("El resultado es "+ res);
            }else{
                if (numOp==3) {
                    res = n1*n2;
                    System.out.println("El resultado es "+ res);
                }else{
                    if (numOp==4) {
                        res = n1/n2;
                        System.out.println("El resultado es "+ res);
                    }else{
                        System.out.println("Caracter no válido, por favor ingrese nuevamente el número de operación.");
                    }
                }
            }
        }
        
        

        
    }
}
