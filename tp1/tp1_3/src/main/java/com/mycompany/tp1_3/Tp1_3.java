
package com.mycompany.tp1_3;
import java.util.Scanner;

public class Tp1_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n1 = teclado.nextInt();
        System.out.println("Ingrese otro número");
        int n2 = teclado.nextInt();
        if (n1>n2) {
            System.out.println("El número "+n1+" es mayor que el número "+n2);
            
        }else{
            if (n1<n2) {
                System.out.println("El número "+n2+" es mayor que el número "+n1);
                
            }else{
                System.out.println("Son números iguales");
            }
        }
    }
}
