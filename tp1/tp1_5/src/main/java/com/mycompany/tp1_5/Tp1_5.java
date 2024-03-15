
package com.mycompany.tp1_5;
import java.util.Scanner;

public class Tp1_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dos números y el programa le indicará si el primero es múltiplo del segundo");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        if (n1%n2==0) {
            System.out.println("El número "+n1+" es múltiplo de "+n2);
            
        }else{
            System.out.println("El número "+n1+" NO es múltiplo de "+n2);
        }
    }
}
