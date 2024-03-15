/* Simular lanzamiento de dados,
   pedir num veces que se tiran, mostrar en una tabla 
   cuántas veces aparece cada suma */

import java.util.Scanner;

public class Tp_1_13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numTiros, dado1, dado2;
        int rango = 6 - 1 + 1;
        int j = 0;
        int k = 0;
        int indice;
        String[] repetidos = new String[21];
        int numPosComb = 35;

        System.out.println("Ingrese la cantidad de veces que quiere tirar los dados:");
        numTiros = teclado.nextInt();
        int[][] combinaciones = new int[numPosComb][2];

        for (int i = 0; i < numTiros; i++) {
            // Asignar número aleatorio a los dos dados
            System.out.println("Tirada número " + (i + 1) + ":");
            System.out.println("Primer dado:");
            dado1 = (int) (Math.random() * rango) + 1;
            System.out.println(dado1);
            System.out.println("Segundo dado:");
            dado2 = (int) (Math.random() * rango) + 1;
            System.out.println(dado2);
            // Guardar la combinación
            int combinacion = Math.min(dado1, dado2) * 10 + Math.max(dado1, dado2);
            if (combinaciones[combinacion][0] == 0) {
                combinaciones[combinacion][0] = combinacion;
            }
            // Verificar cantidad de veces que se repite
            j = 0; // Reiniciar el contador
            while (j < numTiros) {
                if (combinacion == combinaciones[j][0]) {
                    combinaciones[combinacion][1]++;
                    // Se repite
                }
                j++;
            }
        }

        // Mostrar tabla con las combinaciones
        System.out.println("\nTabla de combinaciones y repeticiones:");
        System.out.println("Combinacion\tRepeticiones");
        for (int i = 0; i < numPosComb; i++) {
            if (combinaciones[i][1] > 0) {
                System.out.println(combinaciones[i][0] + "\t\t" + combinaciones[i][1]);
            }
        }
    }
}
