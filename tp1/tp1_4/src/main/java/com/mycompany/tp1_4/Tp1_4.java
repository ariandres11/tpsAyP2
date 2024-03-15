
package com.mycompany.tp1_4;
import java.util.Scanner;

public class Tp1_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número y el programa le dirá si es par o impar");
        int num = teclado.nextInt();
        if (num%2==0) {
            System.out.println("El número introducido es par");
        }else{
            System.out.println("El número introducido es impar");
            
        }
    }
}
