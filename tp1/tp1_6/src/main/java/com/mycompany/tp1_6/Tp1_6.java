
package com.mycompany.tp1_6;
import java.util.Scanner;

public class Tp1_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduca un nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduca un apellido");
        String apellido = teclado.nextLine();
        System.out.println(nombre+" "+apellido);
    }
}
