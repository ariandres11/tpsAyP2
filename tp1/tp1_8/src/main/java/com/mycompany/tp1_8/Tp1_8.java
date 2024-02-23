
package com.mycompany.tp1_8;
import java.util.Scanner;

public class Tp1_8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 0; i <= 10; i++) {
           System.out.println("Ingrese un número");
           num = teclado.nextInt();
            if (num>0) {
                positivos++;
            }else{
                if (num<0) {
                    negativos++;
                }else{
                    ceros++;
                }
            }
        }
        System.out.println("Cantidades: ");
        System.out.println("Negativos: "+ negativos);
        System.out.println("Ceros: "+ ceros);
        System.out.println("Positivos: "+ positivos);
        
        
    }
}
