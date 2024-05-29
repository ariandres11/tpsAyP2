package tp4_4;

import java.util.Scanner;

public class Tp4_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero : ");
        int num = input.nextInt();
        System.out.println("Ingrese el exponente : ");
        int exp = input.nextInt();
        long startTime = System.nanoTime();
        //long resultado = potenciaOptimizada(base, exponente);
        long endTime = System.nanoTime();

        long tiempoEjecucion = endTime - startTime;
        System.out.println("Resultado con el metodo 1 : " + PotenciaRecursiva.metodo1(num, exp));

        System.out.println("Resultado con el metodo 2 : " + PotenciaRecursiva.potenciaOptimizada(num, exp));
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " nanosegundos");
    }

}

/*
La funcion recursiva optimizada tarda 200 ns y la funcion no optimizada tarda 300 ns
Ambas son O(log n)
*/
